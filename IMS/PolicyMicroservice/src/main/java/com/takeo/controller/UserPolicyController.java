package com.takeo.controller;

import com.takeo.entity.PolicyEntity;
import com.takeo.service.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/policy/user/api/policy")
public class UserPolicyController {
    @Autowired
    private PolicyServiceImpl policyService;

    @GetMapping("/view/{policy_number}")
    public ResponseEntity<List<PolicyEntity>> getByPolicyNumber(@PathVariable("policy_number") String policyNumber){
        return ResponseEntity.ok(policyService.findByPolicyNumber(policyNumber));
    }
    @GetMapping("/view/{id}")
    public ResponseEntity<Optional<PolicyEntity>> getPolicyById(@PathVariable("id") int  id){

        return ResponseEntity.ok(policyService.getPolicyById(id));
    }



}
