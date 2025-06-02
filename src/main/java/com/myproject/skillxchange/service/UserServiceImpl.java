package com.myproject.skillxchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.skillxchange.SecurityConfig.JwtProvider;
import com.myproject.skillxchange.repository.UserRepository;
import com.myproject.skillxchange.usermodel.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserProfileByJwt(String jwt) {
        return userRepository.findByEmail(JwtProvider.getEmailFromJwtToken(jwt)); 
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
