package com.bsb.helpsupport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.EmbeddedSolrServerFactoryBean;

@Configuration
@EnableSolrRepositories("")
@Profile("dev")
@PropertySource("classpath:application.properties")
public class EmbeddedSolrContext {

	private Environment env;

	@Bean
	public EmbeddedSolrServerFactoryBean solrServerFactoryBean() {
		EmbeddedSolrServerFactoryBean factory = new EmbeddedSolrServerFactoryBean();
		factory.setSolrHome(env.getRequiredProperty("solr.solr.home"));
		return factory;
	}

	@Bean
	public SolrOperations solrTemplate() throws Exception {
		return new SolrTemplate(solrServerFactoryBean().getObject());
	}

}
