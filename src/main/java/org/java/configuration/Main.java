package org.java.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student s = (Student) context.getBean("s1"); // Explicit cast to Student
        System.out.println(s);

        System.out.println("_______________________________________________");
        Student student = (Student) context.getBean("s2"); // Explicit cast to Student
        System.out.println(student);
    }
}
