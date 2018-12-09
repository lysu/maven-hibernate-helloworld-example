package com.uiu.cdip;


public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {

        Student student = new Student();
        student.setName("Shajed");

        student.setCgpa(studentService.calculateCGPA());
        return student;
    }
}
