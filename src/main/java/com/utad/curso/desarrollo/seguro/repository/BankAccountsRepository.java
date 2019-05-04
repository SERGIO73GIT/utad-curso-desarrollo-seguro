package com.utad.curso.desarrollo.seguro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utad.curso.desarrollo.seguro.entity.BankAccountEntity;

public interface BankAccountsRepository
        extends JpaRepository<BankAccountEntity, Long> {

    // @Query("select... haria tu query")
    BankAccountEntity findByIban(
            String iban);

    List<BankAccountEntity> findByOwnerUserId(
            Long iban);
}
