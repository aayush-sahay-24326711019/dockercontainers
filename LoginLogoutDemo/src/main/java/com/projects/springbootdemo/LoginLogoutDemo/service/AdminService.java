package com.projects.springbootdemo.LoginLogoutDemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface AdminService {
    boolean authenticate(String email, String password);
}
