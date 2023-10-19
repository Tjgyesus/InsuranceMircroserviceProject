package com.takeo.service;

import com.takeo.client.PolicyClient;
import com.takeo.dto.ClaimDto;
import com.takeo.entity.Claim;
import com.takeo.entity.Policy;
import com.takeo.repo.ClaimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService{
    @Autowired
    private ClaimRepo claimRepo;
    @Autowired
    private PolicyClient policyClient;

    @Override
    public Claim createClaim(ClaimDto claimDto) {
        Claim claim = Claim.builder()
                .claimNumber(claimDto.getClaimNumber())
                .description(claimDto.getDescription())
                .incidentClaim(claimDto.getIncidentClaim())
                .policyNumber(claimDto.getPolicyNumber())
                .build();
        claimRepo.save(claim);

        return claim;
    }

    @Override
    public List <Claim> viewAllClaims() {
        List <Claim> claimList = claimRepo.findAll();
        return claimList;
    }

    @Override
    public Optional <Claim> getClaimById(int id) {
       Optional<Claim> claimbyId = claimRepo.findById(id);
        return claimbyId;
    }

    @Override
    public Claim findClaimByClaimNumber(String claimNumber) {
        Claim byClaimNumber = claimRepo.findClaimByClaimNumber(claimNumber);
        return byClaimNumber;
    }

    @Override
    public List<Claim> getUserPolicy(Policy policyNumber) {
        List<Claim> userPolicy = claimRepo.findByPolicyNumber(policyNumber);
        userPolicy.forEach(claim -> claim.setPolicy(policyClient.getByPolicyNumber(claim.getPolicyNumber())));
        return userPolicy;
    }


}
