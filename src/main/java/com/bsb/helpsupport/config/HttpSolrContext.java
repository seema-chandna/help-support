package com.bsb.helpsupport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.HttpSolrServerFactoryBean;

@Configuration
@EnableSolrRepositories("")
@Profile("prod")
@PropertySource("classpath:application.properties")
public class HttpSolrContext {

	private Environment env;

	@Bean
	public HttpSolrServerFactoryBean solrServerFactoryBean() {
		HttpSolrServerFactoryBean factory = new HttpSolrServerFactoryBean();
		factory.setUrl(env.getRequiredProperty("solr.server.url"));
		return factory;
	}

	@Bean
	public SolrOperations solrTemplate() throws Exception {
		return new SolrTemplate(solrServerFactoryBean().getObject());
	}

}
