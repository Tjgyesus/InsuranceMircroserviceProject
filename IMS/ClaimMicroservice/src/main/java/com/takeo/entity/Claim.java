package com.takeo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "claim_client")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String claimNumber;
    private String description;
    private Date incidentClaim;
    private String status;
//    @Column(name = "policy_number")
    private String policyNumber;
    @Transient
//    @OneToMany(cascade = CascadeType.ALL, targetEntity = Policy.class)
//    @JoinColumn(name = "policy_number", referencedColumnName = "policyNumber")
    private List <Policy> policy = new ArrayList<>();


}
