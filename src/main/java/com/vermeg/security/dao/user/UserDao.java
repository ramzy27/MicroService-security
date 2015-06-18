package com.vermeg.security.dao.user;

import com.veermeg.security.dao.Dao;
import com.vermeg.security.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}