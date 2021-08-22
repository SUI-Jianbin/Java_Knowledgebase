package com.jianbin.javaknowledgebase;

public class Student {
    public String StuName;
    public int StuId;
    public int StuAge;
    public char StuGender;

    public void Study (){
        System.out.println("Hello, I am learning Java now.");
    }
    public void SayHello (){
        System.out.println("My name is "+ StuName+ " I am "+ StuAge +" years old");
    }

}
