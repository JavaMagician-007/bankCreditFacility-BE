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
@Table(name="users",schema="bank_credit_facility")
public class UsersEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="ID")
    private UUID id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="USER_BANK_ACCOUNT")
    private String userBankAccount;

    @Column(name="USER_ADDRESS")
    private String userAddress;

    @Column(name="USER_CONTACT_NO")
    private String userContactNo;

    @Column(name="CREATED_AT")
    private Date createdAt;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="UPDATED_AT")
    private Date updatedAt;

    @Column(name="UPDATED_BY")
    private String updatedBy;



}
