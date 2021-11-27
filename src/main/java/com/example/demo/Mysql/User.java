package com.example.demo.Mysql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
   @Id
    private  int ID;
    private String Name;
    private int Age;


    public int getID() {
        return ID;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
