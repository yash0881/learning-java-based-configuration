package org.java.configuration;

public class Student {

    int id;
     int roll;
     String name;

    public Student(int id, int roll, String name) {
        this.id = id;
        this.roll = roll;
        this.name = name;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
