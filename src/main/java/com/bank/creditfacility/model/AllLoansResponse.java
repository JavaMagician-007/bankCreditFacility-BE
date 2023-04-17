package com.bank.creditfacility.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AllLoansResponse {

    private String loanType;
    private String loanAmount;
    private String paymentMadeSoFar;
}
