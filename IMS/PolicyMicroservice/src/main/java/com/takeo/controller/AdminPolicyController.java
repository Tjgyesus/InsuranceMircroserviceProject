package com.takeo.controller;

import com.takeo.dto.PolicyDto;
import com.takeo.entity.PolicyEntity;
import com.takeo.service.PolicyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy/admin/api/policy")
public class AdminPolicyController {
    @Autowired
    private PolicyServiceImpl policyService;

    @PostMapping("/create_policy")
    public ResponseEntity<PolicyEntity> registerPolicy(@RequestBody PolicyDto policyDto){
        return new ResponseEntity<>(policyService.createPolicy(policyDto), HttpStatus.CREATED);
    }
    @GetMapping("/view_all")
    public ResponseEntity<List<PolicyEntity>> showAllPolicy(){
        return ResponseEntity.ok(policyService.viewAll());
    }
    @GetMapping("/view/{policy_number}")
    public ResponseEntity<List<PolicyEntity>> getByPolicyNumber(@PathVariable("policy_number") String policyNumber){
        return ResponseEntity.ok(policyService.findByPolicyNumber(policyNumber));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PolicyEntity> updatePolicy(@PathVariable("id") int id,
                                               @RequestBody PolicyEntity policy){
        policy.setId(id);
        PolicyEntity updatePolicy =policyService.updatePolicy(policy);
        return new ResponseEntity<>(updatePolicy, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePolicy(@PathVariable("id") int id){
        policyService.deletePolicy(id);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }



}
