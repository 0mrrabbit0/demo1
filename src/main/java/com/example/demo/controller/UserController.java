package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserDao userDao ;
    //查询数据
    @GetMapping("/getAll")
    public List getAll(){
        List all = userDao.findAll();
        return all;
    }
    //添加数据、修改数据
    @GetMapping("/add")
    public User add(@RequestParam("ID") int ID,
                    @RequestParam("Name") String Name,
                    @RequestParam("Age") int Age){
        User user =new User();
        user.setID(ID);
        user.setName(Name);
        user.setAge(Age);
        userDao.save(user);
//        User save =userDao.save(user);
        return userDao.save(user);
    }
    //删除单条数据
    @GetMapping("/deleteOne")
    public  String deleteOne(@RequestParam("ID") int ID){
        userDao.deleteById(ID);
        return "删除成功";
    }
    //删除多条数据
    @GetMapping("deleteAll")
    public  String deleteAll(){
        userDao.deleteAll();
        return "删除所有数据成功";
    }
        }