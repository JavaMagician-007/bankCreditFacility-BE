package com.bank.creditfacility.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name="credit_facility",schema="bank_credit_facility")
public class CreditFacilityEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="ID")
    private UUID id;

    @Column(name="CREDIT_FACILITY_TYPE")
    private String creditFacilityType;

    @Column(name="MAX_AMOUNT")
    private String maxAmount;

    @Column(name="MIN_AMOUNT")
    private String minAmount;

    @Column(name="PROCESSING_FEE")
    private String processingFee;

    @Column(name="INTEREST_RATE")
    private String interestRate;

    @Column(name="MAX_PAYMENT_PERIOD_IN_MONTHS")
    private String maxPaymentPeriodInMonths;

    @Column(name="CREATED_AT")
    private Date createdAt;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="UPDATED_AT")
    private Date updatedAt;

    @Column(name="UPDATED_BY")
    private String updatedBy;
}
