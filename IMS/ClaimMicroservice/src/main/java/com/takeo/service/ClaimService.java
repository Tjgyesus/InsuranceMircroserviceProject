package com.takeo.service;

import com.takeo.dto.ClaimDto;
import com.takeo.entity.Claim;
import com.takeo.entity.Policy;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    Claim createClaim(ClaimDto claimDto);
    List <Claim> viewAllClaims();
    Optional <Claim> getClaimById(int id);
    Claim findClaimByClaimNumber(String claimNumber);
    List <Claim> getUserPolicy(Policy policyNumber);




}
