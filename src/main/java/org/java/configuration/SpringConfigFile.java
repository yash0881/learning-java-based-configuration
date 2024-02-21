package org.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Student std() {
        Student s = new Student();
        s.setRoll(102);
        s.setName("Suraj");
        s.setId(1002);
        return s;
    }
}
