package com.api.springboot.example.springboot2restservicebasic;

import sun.awt.SunHints;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

    @Entity
    public class Student {

        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String passportNumber;

        public Student ()   {
        super() ;
    }
    public Student (Long id,String name,String passportNumber) {
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public Long getId (){
        return id;
    }
    public  void setId (Long id1){
        this.id = id1;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber1){
        this.passportNumber = passportNumber1;
    }
}

