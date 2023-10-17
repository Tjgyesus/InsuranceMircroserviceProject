package com.takeo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "calim_client")
public class ClaimEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String claimNumber;
    private String description;
    private Date incidentClaim;
    private String status;
//    @Transient
//    @OneToMany(targetEntity = PolicyClient.class)
//    @JoinColumn(name = "policy_id", referencedColumnName = "id")
//    private PolicyClient policyId;


}
