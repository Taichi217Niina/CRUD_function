package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

/**
 * Sreviveクラス.
 * 基本的にControllerとRepositoryの仲介役を担当
 * 
 * @author niinataichi
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User findById(Long id) {
        return userMapper.findById(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void insert(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.updateInfo(user);
    }

    public void delete(Long id) {
        userMapper.deleteById(id);
    }
	
	

}
