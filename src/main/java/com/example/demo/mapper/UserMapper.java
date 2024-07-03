package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

/**
 * Mapperクラス.
 * 
 * @author niinataichi
 *
 */
@Mapper
public interface UserMapper {
	
    User findById(Long id);

    List<User> findAll();

    void insert(User user);

    void updateInfo(User user);

    void deleteById(Long id);

}
