package com.bsb.helpsupport.service;

import com.bsb.helpsupport.model.TodoDocument;

public interface TodoIndexService {

	public void addToIndex(TodoDocument todoEntry);

	public void deleteFromIndex(Long id);
}
