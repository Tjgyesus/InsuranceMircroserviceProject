package com.takeo.repo;

import com.takeo.dto.ClaimDto;
import com.takeo.entity.Claim;
import com.takeo.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimRepo extends JpaRepository<Claim, Integer> {

    Claim findClaimByClaimNumber(String claimNumber);
    List<Claim> findByPolicyNumber(Policy policyNumber);

}
