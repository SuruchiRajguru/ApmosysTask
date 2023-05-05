package com.apmosys.apiauditpoc.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apmosys.apiauditpoc.dto.request.ApiAuditRequest;
import com.apmosys.apiauditpoc.dto.response.ResponseDTO;
import com.apmosys.apiauditpoc.entity.ApiAuditDetails;
import com.apmosys.apiauditpoc.service.ApiAuditService;


@RestController
@RequestMapping("/apiAudit")
@CrossOrigin(origins="*")
public class ApiAuditController {

	@Autowired
	private ApiAuditService apiAuditService;

	@PostMapping("/addApiAuditDetails")
	public ResponseEntity<ResponseDTO> addApiAuditDetails(@RequestBody ApiAuditRequest apiAuditRequest) {
		ResponseEntity<ResponseDTO> response = apiAuditService.addApiAuditDetails(apiAuditRequest);
		return response;

	}
	
	@GetMapping("/fetchAuditDetails")
	public List<ApiAuditDetails> fetchAuditDetails(){
		return apiAuditService.fetchAuditDetails();
		
	}
	
//	@GetMapping("/viewAllAuditDetails/id")
//	public  ResponseEntity<ResponseDTO> viewAllAuditDetails(Integer Id)
//	{
//		ResponseEntity<ResponseDTO> response = apiAuditService.getApiAuditDetailsById(Id);
//		return response;
//	}
	
	@GetMapping("/viewAuditDetailsById/{id}")
	public  ApiAuditDetails viewAllAuditDetails(@PathVariable("id") Integer id)
	{
		return apiAuditService.getApiAuditDetailsById(id);
		 
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		apiAuditService.deleteApiAuditDetails(id);
		
	}
	
	@PutMapping("updateApiAuditDetailsById/{id}")
	public ResponseEntity<ApiAuditDetails> updateApiAuditDetailById(@RequestBody ApiAuditDetails apiAuditDetails,@PathVariable Integer id)
	{
		try {
			ApiAuditDetails existApiAudit=apiAuditService.getApiAuditDetailsById(id);
			apiAuditDetails.setId(id);
			//ApiAuditRequest apiAuditRequest;
			apiAuditService.getApiAuditDetailsById(id);
			return new ResponseEntity<ApiAuditDetails>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<ApiAuditDetails>(HttpStatus.NOT_FOUND);
		}
	}



}
	


