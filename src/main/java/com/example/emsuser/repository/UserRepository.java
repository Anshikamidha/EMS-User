package com.example.emsuser.repository;

import com.example.emsuser.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
    boolean existsByEmail(String email);
    UserModel findByEmail(String email);
}
