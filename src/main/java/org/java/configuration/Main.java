package org.java.configuration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student s = context.getBean(Student.class);
        System.out.println(s);
    }
}