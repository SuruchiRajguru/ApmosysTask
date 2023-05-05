package com.apmosys.apiauditpoc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.apmosys.apiauditpoc.dto.request.ApiAuditRequest;
import com.apmosys.apiauditpoc.dto.response.ResponseDTO;
import com.apmosys.apiauditpoc.entity.ApiAuditDetails;
import com.apmosys.apiauditpoc.repository.ApiAuditDetailsRepository;
import com.apmosys.apiauditpoc.service.ApiAuditService;
import com.apmosys.apiauditpoc.utils.CommonUtils;

@Service
public class ApiAuditServiceImpl implements ApiAuditService {
	
	@Autowired
	private ApiAuditDetailsRepository apiAuditDetailsRepository;
	
	@Autowired
	private CommonUtils commonUtils;

	@Override
	public ResponseEntity<ResponseDTO> addApiAuditDetails(ApiAuditRequest apiAuditRequest) {
		try {
			if(CollectionUtils.isEmpty(apiAuditRequest.getApiAuditDetails())) {
				return commonUtils.generateResponse("400 : Bad Request","Bad Request" , HttpStatus.OK);
			}
			apiAuditDetailsRepository.saveAll(apiAuditRequest.getApiAuditDetails());
		}catch(Exception e) {
			return commonUtils.generateResponse("500 : Internal Server Error",e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return commonUtils.generateResponse("200 : Success","Success" , HttpStatus.OK);
	}

	

	@Override
	public List<ApiAuditDetails> fetchAuditDetails() {
		// TODO Auto-generated method stub
		return apiAuditDetailsRepository.findAll() ;
	}



	@Override
	public ApiAuditDetails getApiAuditDetailsById(Integer id) {
		// TODO Auto-generated method stub
		return apiAuditDetailsRepository.findById(id).get();
		
	}



	@Override
	public boolean deleteApiAuditDetails(Integer id) {
		// TODO Auto-generated method stub
		apiAuditDetailsRepository.deleteById(id);
		return true;
	}
	
	
	

}
