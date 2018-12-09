package com.uiu.cdip;

import javax.xml.bind.SchemaOutputResolver;

public class Student extends Object {
    private String name;
    private float cgpa;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
