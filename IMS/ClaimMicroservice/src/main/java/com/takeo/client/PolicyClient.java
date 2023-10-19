package com.takeo.client;

import com.takeo.entity.Claim;
import com.takeo.entity.Policy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface PolicyClient {

    @GetExchange("/policy/view/{policy_number}")
    public List<Policy> getByPolicyNumber(@PathVariable("policy_number") String policyNumber);
}
