package com.example.testsolr.controller;

import com.example.testsolr.slordto.Assetstorage;
import com.example.testsolr.slordto.SolrAssetstorageUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.SolrParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/test")
public class TestSlorController {
  @Autowired
  private SolrClient client;
    @RequestMapping("getMessage")
    public SolrDocumentList getMessage() throws Exception{
        SolrQuery params = new SolrQuery();
      params.set("q","*:*");
       params.addFilterQuery("usename:向真");
        QueryResponse assetmaintenance_core = client.query("assetstorage_core",params);
        return assetmaintenance_core.getResults();
    }
    @RequestMapping("getMessage1")
    public SolrDocument getMessage1() throws Exception{
        //assetsid":"2f5f76dd-c944-4784-8813-99624b35ca70
        SolrDocument assetstorage_core = client.getById("assetstorage_core", "2f5f76dd-c944-4784-8813-99624b35ca70");
        return assetstorage_core;
    }
    //新增  修改
    @RequestMapping("add")
    public SolrDocument add() throws Exception{
        //assetsid":"2f5f76dd-c944-4784-8813-99624b35ca70
//        SolrDocument assetstorage_core = client.getById("assetstorage_core", "2f5f76dd-c944-4784-8813-99624b35ca70");
//        return assetstorage_core;
        SolrInputDocument solrInputFields = new SolrInputDocument();
        solrInputFields.addField("id","2");
        solrInputFields.addField("name","汪汪哒哼");
        client.add("collection2",solrInputFields);
        client.commit("collection2");
        return  null;
    }
    @RequestMapping("delete")
 public String delete() throws  Exception{
    // UpdateResponse updateResponse = client.deleteById("collection1","2");
        client.deleteById("collection1","2");
        client.commit("collection1");
     return  "删除成功";

 }
 //根据id查询数据信息  然后修改当前信息Sl
 @RequestMapping("findid")
 public String findById() throws  Exception{
     // UpdateResponse updateResponse = client.deleteById("collection1","2");
     //根据id查询 封装成实体类
     SolrQuery params = new SolrQuery();
     params.set("q","assetsid:2f5f76dd-c944-4784-8813-99624b35ca70");
     QueryResponse assetmaintenance_core = client.query("assetstorage_core",params);
     SolrDocumentList results = assetmaintenance_core.getResults();
     SolrDocument document = results.get(0);
     //将SolrDocument转成实体类
     Assetstorage assetstorage = (Assetstorage) toBean(document, Assetstorage.class);
     //向真
     assetstorage.setUsename("向真");
     client.add("assetstorage_core", SolrAssetstorageUtils.getSolrInputDocument(assetstorage));
     client.commit("assetstorage_core");
     return  "删除成功";

 }
    public   Object toBean( SolrDocument record , Class clazz){

        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (InstantiationException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Field[] fields =   clazz.getDeclaredFields();
        for(Field field:fields){
            Object value = record.get(field.getName());
            try {
                BeanUtils.setProperty(o, field.getName(), value);
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return o;
    }

    public  Object toBeanList(SolrDocumentList records, Class  clazz){
        List list = new ArrayList();
        for(SolrDocument record : records){
            list.add(toBean(record,clazz));
        }
        return list;
    }
}
