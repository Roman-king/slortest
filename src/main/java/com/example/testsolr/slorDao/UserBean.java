package com.example.testsolr.slorDao;

import org.apache.solr.client.solrj.beans.Field;

public class UserBean {
    private int id;
    @Field("name")
    private  String name;
    @Field("age")
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
