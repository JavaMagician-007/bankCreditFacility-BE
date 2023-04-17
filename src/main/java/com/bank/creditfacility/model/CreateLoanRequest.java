package com.bank.creditfacility.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class CreateLoanRequest {

    private UUID userId;
    private String loanType;
    private BigDecimal loanAmount;
    private BigDecimal interestRate;
    private Date loanStartDate;
    private Date loanEndDate;
}
