package com.bank.creditfacility.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CreateUserRequest {

    private String userName;
    private String userBankAccount;
    private String userAddress;
    private String userContactNo;
}
