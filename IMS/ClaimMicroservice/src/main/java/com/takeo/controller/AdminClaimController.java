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
import java.util.Random;


@RestController
@RequestMapping("/claim/admin/api/claim")
public class AdminClaimController {
    @Autowired
    private ClaimServiceImpl claimService;

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
    @PutMapping("/update/{id}")
    public ResponseEntity<Claim> updateClaim(@PathVariable("id") int id,
                                             @RequestBody Claim claim){
        claim.setId(id);
        Claim updateClaim =claimService.updateClaim(claim);
        return new ResponseEntity<>(updateClaim, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteClaim(@PathVariable("id") int claimId){
        claimService.deleteClaim(claimId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }

    }


