package com.example.demo.Mysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User,Integer>{

}
