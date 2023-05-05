package com.apmosys.apiauditpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apmosys.apiauditpoc.entity.ApiAuditDetails;

public interface ApiAuditDetailsRepository extends JpaRepository<ApiAuditDetails,Integer>{

}
