package com.projects.springbootdemo.LoginLogoutDemo.repository;

import com.projects.springbootdemo.LoginLogoutDemo.entity.AdminActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminActivityRepository extends JpaRepository<AdminActivity, Long> {

}
