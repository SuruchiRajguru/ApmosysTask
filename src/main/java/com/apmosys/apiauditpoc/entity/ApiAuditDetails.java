package com.apmosys.apiauditpoc.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="api_audit")
public class ApiAuditDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty(value="API")
	private String api;
	
	@JsonProperty(value="Description")
	private String description;
	
	@JsonProperty(value="Auth")
	private String auth;
	
	@JsonProperty(value="HTTPS")
	private boolean https;
	
	@JsonProperty(value="Cors")
	private String cors;
	
	@JsonProperty(value="Link")
	private String link;
	
	@JsonProperty(value="Category")
	private String category;

}
