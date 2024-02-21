package org.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean("s1")
    public Student first() {
        Student s = new Student();
        s.setRoll(102);
        s.setName("Suraj");
        s.setId(1002);
        return s;
    }

    @Bean("s2")
    public Student second(){
        Student s = new Student();
        s.setRoll(103);
        s.setName("Ram");
        s.setId(1004);
        return s;
    }
}
