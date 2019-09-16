package com.os.biz.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "database_sequences")
public class Logs {
	public Logs() {
		
	}
	public Logs(String id, String date, String status, String data, String indexId, String appName) {
		Id = id;
		this.date = date;
		this.status = status;
		this.data = data;
		this.indexId = indexId;
		this.appName = appName;
	}
	@Id
private String Id;
private String date;
private String status;
private String data;
private String indexId;
private String appName;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getIndexId() {
	return indexId;
}
public void setIndexId(String indexId) {
	this.indexId = indexId;
}
public String getAppName() {
	return appName;
}
public void setAppName(String appName) {
	this.appName = appName;
}



}
