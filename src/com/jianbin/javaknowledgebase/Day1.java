package com.jianbin.javaknowledgebase;

public class Day1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.StuAge = 18;
        student1.StuId = 001;
        student1.StuGender = 'M';
        student1.StuName = "Jianbin";
        student1.SayHello();
        student1.Study();
    }

}
