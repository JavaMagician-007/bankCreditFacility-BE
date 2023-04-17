package com.bank.creditfacility.repository;

import com.bank.creditfacility.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, UUID> {
}
