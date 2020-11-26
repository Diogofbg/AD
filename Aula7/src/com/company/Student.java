package com.company;

import java.util.Objects;

public class Student {
    private  int number;
    private  String name;

    public Student(int numerator, int denominator) {
        this.number = numerator;
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

}
