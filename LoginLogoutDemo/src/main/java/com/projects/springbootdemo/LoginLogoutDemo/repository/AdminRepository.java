package com.projects.springbootdemo.LoginLogoutDemo.repository;

import com.projects.springbootdemo.LoginLogoutDemo.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);
}
