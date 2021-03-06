package com.utad.curso.desarrollo.seguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utad.curso.desarrollo.seguro.entity.UserEntity;

public interface UsersRepository
extends JpaRepository<UserEntity, Long> {

UserEntity findByUsername(
    String username);

}