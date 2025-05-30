package com.myproject.skillxchange.service;

import java.util.List;

import com.myproject.skillxchange.usermodel.User;


public interface  UserService {
    public List<User> getAllUser()  ;
     
     public User findUserProfileByJwt(String jwt);
     
     public User findUserByEmail(String email) ;
     
     public User findUserById(Long userId) ;

     public List<User> findAllUsers();
}
