package com.jianbin.javaknowledgebase;

public class Student {
    static int count;
    public String StuName;
    public int StuId;
    public int StuAge;
    public char StuGender;

    public static void CountStu(){
        count++;
        System.out.println(count);
    }

    public Student(){

    }
    public Student (String name, int age, char gender){
        this();
        this.StuName = name;
        this.StuAge = age;
        this.StuGender = gender;
    }
    public void Study (){
        System.out.println("Hello, I am learning Java now.");
    }
    public void SayHello (){
        System.out.println("My name is "+ StuName+ " I am "+ StuAge +" years old");
    }

}
