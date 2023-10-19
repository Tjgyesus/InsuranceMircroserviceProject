package com.takeo.repo;

import com.takeo.entity.PolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyEntity, Integer> {

    List <PolicyEntity> findByPolicyNumber(String policyNumber);
}
