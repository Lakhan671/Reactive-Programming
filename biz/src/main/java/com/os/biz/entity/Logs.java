package com.os.biz.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "database_sequences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logs {
	@Id
private String Id;
private String date;
private String status;
private String data;
private String indexId;
private String appName;


}
