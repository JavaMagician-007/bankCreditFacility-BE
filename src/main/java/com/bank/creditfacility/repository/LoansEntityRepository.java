package com.bank.creditfacility.repository;

import com.bank.creditfacility.entity.LoansEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoansEntityRepository extends JpaRepository<LoansEntity, UUID> {
}
