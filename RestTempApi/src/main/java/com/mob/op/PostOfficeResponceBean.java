package com.mob.op;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOfficeResponceBean {
	@JsonProperty("Messsage")
	private String messsage;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("PostOffice")
	private List<PostOfficeDetails> postOffice;
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PostOfficeDetails> getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(List<PostOfficeDetails> postOffice) {
		this.postOffice = postOffice;
	}
	

}
