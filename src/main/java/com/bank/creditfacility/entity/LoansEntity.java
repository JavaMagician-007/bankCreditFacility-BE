package com.bank.creditfacility.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name="loans",schema="bank_credit_facility")
public class LoansEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="ID")
    private UUID id;

    @Column(name="USER_ID")
    private UUID userId;

    @Column(name= "LOAN_TYPE", nullable = false)
    private String loanType;

    @Column(name= "LOAN_ACCOUNT_NO", nullable = false)
    private String loanAccountNo;

    @Column(name= "LOAN_AMOUNT", nullable = false)
    private BigDecimal loanAmount;

    @Column(name = "INTEREST_RATE", nullable = false)
    private BigDecimal interestRate;

    @Column(name = "LOAN_START_DATE",nullable = false)
    private Date loanStartDate;

    @Column(name = "LOAN_END_DATE", nullable = false)
    private Date loanEndDate;

    @Column(name="CREATED_AT")
    private Date createdAt;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="UPDATED_AT")
    private Date updatedAt;

    @Column(name="UPDATED_BY")
    private String updatedBy;
}
