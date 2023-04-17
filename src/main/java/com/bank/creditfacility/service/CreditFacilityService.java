package com.bank.creditfacility.service;

/*import com.bank.creditfacility.entity.CreditFacilityEntity;
import com.bank.creditfacility.entity.LoanPaymentEntity;
import com.bank.creditfacility.entity.LoansEntity;*/
import com.bank.creditfacility.model.*;
/*import com.bank.creditfacility.repository.CreditFacilityRepository;
import com.bank.creditfacility.repository.LoanPaymentEntityRepository;
import com.bank.creditfacility.repository.LoansEntityRepository;
import com.bank.creditfacility.repository.UsersRepository;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CreditFacilityService {

//    @Autowired
//    private UsersRepository usersRepository;
//
//    @Autowired
//    private CreditFacilityRepository creditFacilityRepository;
//
//    @Autowired
//    private LoansEntityRepository loansEntityRepository;
//
//    @Autowired
//    private LoanPaymentEntityRepository loanPaymentEntityRepository;

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

        //Save New User to DB
//        usersRepository.save(UsersEntity.builder()
//                .id(UUID.randomUUID())
//                .userName(createUserRequest.getUserName())
//                .userBankAccount(createUserRequest.getUserBankAccount())
//                .userContactNo(createUserRequest.getUserContactNo())
//                .userAddress(createUserRequest.getUserAddress())
//                .createdAt(new Date())
//                .createdBy("System")
//                .build());

        return CreateUserResponse.builder().message("User Created Successfully").build();
    }

    public UserDetailsResponse getUserDetails(String id) {
        //Call DB to fetch users details using user id and set it as response
        //Optional<UsersEntity> usersEntity = usersRepository.findById(UUID.fromString(id));

        //dummy response
        return UserDetailsResponse.builder()
                .userName("Bob").userBankAccount("1234567890")
                .userContactNo("6512345678").userAddress("Singapore")
                .build();
    }

    public CreateCreditFacilityResponse createCreditFacility(CreateCreditFacilityRequest createCreditFacilityRequest) {

        //Save New Credit Facility to DB
//        creditFacilityRepository.save(CreditFacilityEntity.builder()
//                .id(UUID.randomUUID())
//                .creditFacilityType(createCreditFacilityRequest.getCreditFacilityType())
//                .interestRate(createCreditFacilityRequest.getInterestRate())
//                .maxAmount(createCreditFacilityRequest.getMaxAmount())
//                .minAmount(createCreditFacilityRequest.getMinAmount())
//                .processingFee(createCreditFacilityRequest.getProcessingFee())
//                .maxPaymentPeriodInMonths(createCreditFacilityRequest.getMaxPaymentPeriodInMonths())
//                .createdAt(new Date())
//                .createdBy("System")
//                .build());

        return CreateCreditFacilityResponse.builder().message("Credit Facility Created Successfully").build();

    }

    public CreateLoanResponse createLoan(CreateLoanRequest createLoanRequest){

        //Save New Loan for User to DB
//        loansEntityRepository.save(LoansEntity.builder()
//                .id(UUID.randomUUID())
//                .userId(createLoanRequest.getUserId())
//                .interestRate(createLoanRequest.getInterestRate())
//                .loanAmount(createLoanRequest.getLoanAmount())
//                .loanType(createLoanRequest.getLoanType())
//                .loanStartDate(new Date())
//                .loanEndDate(createLoanRequest.getLoanEndDate())
//                .createdAt(new Date())
//                .createdBy("System")
//                .build());

        return CreateLoanResponse.builder().message("Loan Sanctioned Successfully").build();

    }

    public LoanPaymentResponse payLoan(LoanPaymentRequest loanPaymentRequest){

        //Save Loan payment to DB
        //loanPaymentEntityRepository.save(LoanPaymentEntity.builder().build());

        return LoanPaymentResponse.builder().message("Loan Payment Done !!").build();
    }

    public List<AllLoansResponse> getAllLoansForUser(UUID userId){

        //Get All loans of user based on userId
        //loansEntityRepository.findAllById(Collections.singleton(userId));


        List<AllLoansResponse> allLoansResponseList = new ArrayList<>();
        AllLoansResponse allLoansResponse = new AllLoansResponse();
        AllLoansResponse allLoansResponse1 = new AllLoansResponse();
        AllLoansResponse allLoansResponse2 = new AllLoansResponse();

        allLoansResponse.setLoanAmount("300000");
        allLoansResponse.setLoanType("Home Loan");
        allLoansResponse.setPaymentMadeSoFar("100000");

        allLoansResponse1.setLoanAmount("50000");
        allLoansResponse1.setLoanType("Car Loan");
        allLoansResponse1.setPaymentMadeSoFar("10000");

        allLoansResponse2.setLoanAmount("5000000");
        allLoansResponse2.setLoanType("Business Loan");
        allLoansResponse2.setPaymentMadeSoFar("1000000");


        allLoansResponseList.add(allLoansResponse);
        allLoansResponseList.add(allLoansResponse1);
        allLoansResponseList.add(allLoansResponse2);

        return allLoansResponseList;
    }


}
