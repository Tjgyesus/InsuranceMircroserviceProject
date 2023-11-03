package com.takeo.service;

import com.takeo.dto.PolicyDto;
import com.takeo.entity.PolicyEntity;

import java.util.List;
import java.util.Optional;

public interface PolicyService {
    PolicyEntity createPolicy(PolicyDto policyDto);
    List <PolicyEntity> viewAll();
    List <PolicyEntity> findByPolicyNumber(String policyNumber);
    Optional<PolicyEntity> getPolicyById(int id);

    PolicyEntity updatePolicy(PolicyEntity  policy);

    void deletePolicy(int id);


}
