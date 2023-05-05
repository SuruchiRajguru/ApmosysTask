package com.apmosys.apiauditpoc.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.apmosys.apiauditpoc.dto.response.ResponseDTO;


@Component
public class CommonUtils {
	
	public ResponseEntity<ResponseDTO> generateResponse(String responseText, Object responseData,HttpStatus httpStatus) {
		return new ResponseEntity<>(new ResponseDTO(responseText, responseData), httpStatus);
	}

}
