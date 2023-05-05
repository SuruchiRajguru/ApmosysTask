package com.apmosys.apiauditpoc.dto.request;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.apmosys.apiauditpoc.entity.ApiAuditDetails;
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

public class ApiAuditRequest {

	private Integer count;
	
	@JsonProperty(value = "entries")
	private List<ApiAuditDetails> apiAuditDetails;
}
