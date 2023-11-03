package com.takeo.service;

import com.takeo.dto.PolicyDto;
import com.takeo.entity.PolicyEntity;
import com.takeo.repo.PolicyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    private PolicyRepo policyRepo;
    
    @Override
    public PolicyEntity createPolicy(PolicyDto policyDto) {
        PolicyEntity policyEntity = PolicyEntity.builder()
                .policyNumber(policyDto.getPolicyNumber())
                .policyHolderName(policyDto.getPolicyHolderName())
                .effectiveDate(policyDto.getEffectiveDate())
                .build();
        policyRepo.save(policyEntity);
        return policyEntity;
    }

    @Override
    public List<PolicyEntity> viewAll() {
        List <PolicyEntity> policyEntity = policyRepo.findAll();
        return policyEntity;
    }

    @Override
    public List <PolicyEntity> findByPolicyNumber(String policyNumber) {
        List<PolicyEntity> policyEntity = policyRepo.findByPolicyNumber(policyNumber);
        return policyEntity;
    }

    @Override
    public Optional<PolicyEntity> getPolicyById(int id) {
        Optional<PolicyEntity> policyEntity = policyRepo.findById(id);
        return policyEntity;
    }

    @Override
    public PolicyEntity updatePolicy(PolicyEntity policy) {
        PolicyEntity existingPolicy =policyRepo.findById(policy.getId()).get();
        existingPolicy.setPolicyNumber(policy.getPolicyNumber());
        existingPolicy.setPolicyHolderName(policy.getPolicyHolderName());
        existingPolicy.setEffectiveDate(policy.getEffectiveDate());

        PolicyEntity updatedPolicy = policyRepo.save(existingPolicy);
        return updatedPolicy;
    }

    @Override
    public void deletePolicy(int id) {
        policyRepo.deleteById(id);

    }

}
