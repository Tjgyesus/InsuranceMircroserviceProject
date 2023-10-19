package com.takeo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PolicyDto {
    private String policyNumber;
    private String policyHolderName;
    private Date effectiveDate;
}
