package com.bsb.helpsupport.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class TodoDocument {

	@Id
	@Field
	private String id;

	@Field
	private String description;

	@Field
	private String title;

	public TodoDocument() {

	}

	// Getters are omitted

	public static class Builder {
		private TodoDocument build;

		public Builder(Long id, String title) {
			build = new TodoDocument();
			build.id = id.toString();
			build.title = title;
		}

		public Builder description(String description) {
			build.description = description;
			return this;
		}

		public TodoDocument build() {
			return build;
		}
	}
}
