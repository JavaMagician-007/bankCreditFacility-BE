package com.bank.creditfacility.controller;

import com.bank.creditfacility.model.*;
import com.bank.creditfacility.service.CreditFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
public class CreditFacilityController {

    @Autowired
    private CreditFacilityService creditFacilityService;

    @GetMapping("/v1/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/v1/users")
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest){
        return ResponseEntity.ok(creditFacilityService.createUser(createUserRequest));
    }

    @GetMapping("/v1/users")
    public ResponseEntity<UserDetailsResponse> getUserDetails(@RequestParam(value = "id") String id){
        return ResponseEntity.ok(creditFacilityService.getUserDetails(id));
    }

    @PostMapping("/v1/creditfacility")
    public ResponseEntity<CreateCreditFacilityResponse> createCreditFacility(@RequestBody CreateCreditFacilityRequest createCreditFacilityRequest){
        return ResponseEntity.ok(creditFacilityService.createCreditFacility(createCreditFacilityRequest));
    }

    @PostMapping("/v1/applyloan")
    public ResponseEntity<CreateLoanResponse> createLoan(@RequestBody CreateLoanRequest createLoanRequest) {
        return ResponseEntity.ok(creditFacilityService.createLoan(createLoanRequest));
    }

    @PutMapping("/v1/loanpayment")
    @CrossOrigin
    public ResponseEntity<LoanPaymentResponse> payLoan(@RequestBody LoanPaymentRequest loanPaymentRequest){
        return ResponseEntity.ok(creditFacilityService.payLoan(loanPaymentRequest));
    }

    @GetMapping("/v1/loans")
    public ResponseEntity<List<AllLoansResponse>> getAllLoansForUser(@RequestParam(value ="userId") UUID userId){
        return ResponseEntity.ok(creditFacilityService.getAllLoansForUser(userId));
    }


}
