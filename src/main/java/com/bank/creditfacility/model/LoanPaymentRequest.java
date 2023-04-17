package com.bank.creditfacility.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class LoanPaymentRequest {

    private UUID userId;
    private String userBankAccount;
    private String loanAccountNo;
    private BigDecimal loanAmount;
}
