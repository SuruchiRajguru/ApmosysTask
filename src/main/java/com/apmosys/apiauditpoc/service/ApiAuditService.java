package com.apmosys.apiauditpoc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.apmosys.apiauditpoc.dto.request.ApiAuditRequest;
import com.apmosys.apiauditpoc.dto.response.ResponseDTO;
import com.apmosys.apiauditpoc.entity.ApiAuditDetails;

public interface ApiAuditService {

	ResponseEntity<ResponseDTO> addApiAuditDetails(ApiAuditRequest apiAuditRequest);

	List<ApiAuditDetails> fetchAuditDetails();
	
	ApiAuditDetails getApiAuditDetailsById(Integer Id);
	
	//ApiAuditDetails getApiAuditDetails(string Name);
	
	boolean deleteApiAuditDetails(Integer id);
}
