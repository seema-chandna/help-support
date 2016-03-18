package com.bsb.valise.helpSupport.dto;

import java.io.Serializable;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class HelpSupportDto implements Serializable {

	private static final long serialVersionUID = -7305437655994492288L;

	@Id
	@Field
	private String id;

	@Field
	private String lob;

	@Field
	private String cat;

	@Field("cat_image_url")
	private String catImageUrl;

	@Field("sub_cat")
	private String subCategory;

	@Field("question")
	private String question;

	@Field("answer_link")
	private String answer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getCatImageUrl() {
		return catImageUrl;
	}

	public void setCatImageUrl(String catImageUrl) {
		this.catImageUrl = catImageUrl;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
