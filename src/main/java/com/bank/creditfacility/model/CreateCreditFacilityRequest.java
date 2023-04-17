package com.bank.creditfacility.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCreditFacilityRequest {

    private String creditFacilityType;
    private String maxAmount;
    private String minAmount;
    private String processingFee;
    private String interestRate;
    private String maxPaymentPeriodInMonths;
}
