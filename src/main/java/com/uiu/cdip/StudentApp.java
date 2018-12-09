package com.uiu.cdip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Struct;

/**
 * Hello world!
 *
 */
public class StudentApp
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("student-app.xml");

        /*Student student = (Student) context.getBean("student");
        student.sayHello();*/

        StudentController sc = (StudentController) context.getBean("student-controller");
        Student student = sc.getStudent();

        System.out.println("name: " + student.getName());
        System.out.println("cgpa: " + student.getCgpa());


    }
}
