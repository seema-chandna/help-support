package com.bsb.helpsupport.repo;

import org.springframework.data.solr.repository.SolrCrudRepository;

public interface TodoDocumentRepository extends SolrCrudRepository<TodoDocumentRepository, String> {

}
