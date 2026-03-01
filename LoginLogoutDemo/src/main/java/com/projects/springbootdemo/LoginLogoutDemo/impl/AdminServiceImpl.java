package com.projects.springbootdemo.LoginLogoutDemo.impl;

import com.projects.springbootdemo.LoginLogoutDemo.repository.AdminRepository;
import com.projects.springbootdemo.LoginLogoutDemo.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {


    private final AdminRepository adminRepository;

    @Override
    public boolean authenticate(String email, String password) {

        return adminRepository.findByEmail(email)
                .map(admin -> admin.getPassword().equals(password))
                .orElse(false);
    }
}
