package com.bank.creditfacility.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDetailsResponse {

    private String userName;
    private String userBankAccount;
    private String userAddress;
    private String userContactNo;

}
