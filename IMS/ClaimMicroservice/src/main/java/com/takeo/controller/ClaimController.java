package com.takeo.controller;

import com.takeo.dto.ClaimDto;
import com.takeo.entity.Claim;
import com.takeo.entity.Policy;
import com.takeo.service.ClaimServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/claim")
public class ClaimController {
    @Autowired
    private ClaimServiceImpl claimService;

    @PostMapping("/create_claim")
    public ResponseEntity<Claim> registerClaim(@RequestBody ClaimDto claimDto){
        return new ResponseEntity<>(claimService.createClaim(claimDto), HttpStatus.CREATED);
    }
    @GetMapping("/view_all")
    public ResponseEntity<List<Claim>> showAllClaims(){
        return ResponseEntity.ok(claimService.viewAllClaims());
    }
    @GetMapping("/view/{id}")
    public ResponseEntity<Optional<Claim>> getClaimById(@PathVariable("id") int id){
        return ResponseEntity.ok(claimService.getClaimById(id));
    }
    @GetMapping("/viewclaim/{claim_number}")
    public ResponseEntity<Claim> getByClaimNumber(@PathVariable("claim_number") String claimNumber){
        return ResponseEntity.ok(claimService.findClaimByClaimNumber(claimNumber));
    }
    @GetMapping("/view_policy")
    public ResponseEntity<List<Claim>> getUserPolicy(@PathVariable("policy_number") Policy policyNumber ){
        return ResponseEntity.ok(claimService.getUserPolicy(policyNumber));
    }



}
