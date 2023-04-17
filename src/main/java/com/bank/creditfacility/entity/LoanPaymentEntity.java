package com.bank.creditfacility.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name="loans_payment",schema="bank_credit_facility")
public class LoanPaymentEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="ID")
    private UUID id;

    @Column(name="USER_ID")
    private UUID userId;

    @Column(name="USER_BANK_ACCOUNT")
    private String userBankAccount;

    @Column(name="LOAN_ACCOUNT_NO")
    private String loanAccountNo;

    @Column(name="LOAN_AMOUNT")
    private BigDecimal loanAmount;

    @Column(name="CREATED_AT")
    private Date createdAt;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="UPDATED_AT")
    private Date updatedAt;

    @Column(name="UPDATED_BY")
    private String updatedBy;
}
