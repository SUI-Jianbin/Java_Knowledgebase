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
        Student.CountStu();
        Student.CountStu();

        Student student2 = new Student("Paul",26,'M');
        Student.CountStu();
        student2.Study();
        student2.SayHello();
        Course course1 = new Course();
        course1.cID = 01;
        course1.cName = "English";
        course1.cTeacher = "James";
        System.out.println(course1.cName);
        System.gc();

        Staff staff1 = new Staff();
        staff1.SayHello();
        Teacher teacher1 = new Teacher();
        teacher1.SayHello();;
        teacher1.Teach();
        Tutor tutor1 = new Tutor();
        tutor1.SayHello();

    }

}
