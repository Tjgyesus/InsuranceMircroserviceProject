package com.takeo.entity;

import java.util.Date;

public record Policy(int id, String policyNumber, String policyHolderName, Date effectiveDate) {
}
