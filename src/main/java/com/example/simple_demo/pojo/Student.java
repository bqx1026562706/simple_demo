package com.example.simple_demo.pojo;

import java.text.MessageFormat;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return (this.getName() + String.valueOf(this.getAge())).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj)
            return false;
        if(obj instanceof Student){
            Student other = (Student)obj;
            return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
        }
        return false;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[name:{0},age:{1}]",this.getName(),this.getAge());
    }
}

