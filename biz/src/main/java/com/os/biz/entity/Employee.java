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
public class Employee {
	@Id
private String Id;
private String name;
private String jobTitle;
private String companyName;
private String city;
private String state;


}
