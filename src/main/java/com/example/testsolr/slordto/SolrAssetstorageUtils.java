package com.example.testsolr.slordto;

import org.apache.solr.common.SolrInputDocument;

public class SolrAssetstorageUtils {

    public static SolrInputDocument getSolrInputDocument(Assetstorage assetstorage){
        SolrInputDocument solrInputFields = new SolrInputDocument();
        solrInputFields.setField("assetsid",assetstorage.getAssetsid());
        solrInputFields.setField("assetscoding",assetstorage.getAssetscoding());
        solrInputFields.setField("assetqrcode",assetstorage.getAssetqrcode());
        solrInputFields.setField("categoryid",assetstorage.getCategoryid());
        solrInputFields.setField("assetname",assetstorage.getAssetname());
        solrInputFields.setField("tenantid",assetstorage.getTenantid());
        solrInputFields.setField("stateid",assetstorage.getStateid());
        solrInputFields.setField("snno",assetstorage.getSnno());
        solrInputFields.setField("department",assetstorage.getDepartment());
        solrInputFields.setField("useto",assetstorage.getUseto());
        solrInputFields.setField("usename",assetstorage.getUsename());
        solrInputFields.setField("userstation",assetstorage.getUserstation());
        solrInputFields.setField("suppliers",assetstorage.getSuppliers());
        solrInputFields.setField("configuration",assetstorage.getConfiguration());
        solrInputFields.setField("purchasedate",assetstorage.getPurchasedate());
        solrInputFields.setField("inbounddate",assetstorage.getInbounddate());
        solrInputFields.setField("original",assetstorage.getOriginal());
        solrInputFields.setField("assetvalue",assetstorage.getAssetvalue());
        solrInputFields.setField("depreciation",assetstorage.getDepreciation());
        solrInputFields.setField("smallvalue",assetstorage.getSmallvalue());
        solrInputFields.setField("imageupload",assetstorage.getImageupload());
        solrInputFields.setField("imageuploadurl",assetstorage.getImageuploadurl());
        solrInputFields.setField("imageuploadnew",assetstorage.getImageuploadnew());
        solrInputFields.setField("remark",assetstorage.getRemark());
        solrInputFields.setField("customfield",assetstorage.getCustomfield());
        solrInputFields.setField("createperson",assetstorage.getCreateperson());
        solrInputFields.setField("createdate",assetstorage.getCreatedate());
        solrInputFields.setField("updateperson",assetstorage.getUpdateperson());
        solrInputFields.setField("updatedate",assetstorage.getUpdatedate());
        solrInputFields.setField("deleteflag",assetstorage.getDeleteflag());
        solrInputFields.setField("createname",assetstorage.getCreatename());
        solrInputFields.setField("updatename",assetstorage.getUpdatename());
        solrInputFields.setField("cleandate",assetstorage.getCleandate());
        solrInputFields.setField("cleanby",assetstorage.getCleanby());
        solrInputFields.setField("cleanreasons",assetstorage.getCleanreasons());
        solrInputFields.setField("recipientsdate",assetstorage.getRecipientsdate());
        solrInputFields.setField("userrealname",assetstorage.getUserrealname());
        solrInputFields.setField("brands",assetstorage.getBrands());
        solrInputFields.setField("source",assetstorage.getSource());
        solrInputFields.setField("channe",assetstorage.getChanne());
        solrInputFields.setField("snconfiguration",assetstorage.getSnconfiguration());
        solrInputFields.setField("overinsurancetime",assetstorage.getOverinsurancetime());
        solrInputFields.setField("expecteddiscardingtime",assetstorage.getExpecteddiscardingtime());
        solrInputFields.setField("printingstatus",assetstorage.getPrintingstatus());
        solrInputFields.setField("model",assetstorage.getModel());
        solrInputFields.setField("measuringunit",assetstorage.getMeasuringunit());
        solrInputFields.setField("buytime",assetstorage.getBuytime());
        solrInputFields.setField("assetclasses",assetstorage.getAssetclasses());
        solrInputFields.setField("statename",assetstorage.getStatename());
        solrInputFields.setField("departmentname",assetstorage.getDepartmentname());
        solrInputFields.setField("usetoname",assetstorage.getUsetoname());
        solrInputFields.setField("suppliersname",assetstorage.getSuppliersname());
        solrInputFields.setField("sourcename",assetstorage.getSourcename());
        solrInputFields.setField("useperiod",assetstorage.getUseperiod());
        solrInputFields.setField("usetoid",assetstorage.getUsetoid());
        solrInputFields.setField("usernameid",assetstorage.getUsernameid());
        return  solrInputFields;
    }
}
