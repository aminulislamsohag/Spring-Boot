package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("SELECT u FROM users u WHERE u.User_name = ?1")
    public Users findByEmail(String User_name);
}