package com.example.testsolr.config;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;

/**
 * Created by evatlsong on 06/12/2017.
 */
public class SolrConfig {

    @Autowired
    private SolrClient solrClient;

    @Bean
    public SolrOperations solrTemplate() {
        return new SolrTemplate(solrClient);
    }
}
