package com.example.testsolr.slorDao;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class UserBean {
    private int id;
    @Field("name")
    private  String Name;
    @Field("age")
    private String Age;
    @Field("birday")
    private Date Birday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public Date getBirday() {
        return Birday;
    }

    public void setBirday(Date birday) {
        Birday = birday;
    }
}
