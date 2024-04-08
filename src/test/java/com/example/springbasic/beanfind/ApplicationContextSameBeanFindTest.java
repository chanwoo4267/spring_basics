package com.example.springbasic.beanfind;

import com.example.springbasic.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class ApplicationContextSameBeanFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
    @Test
    @DisplayName("타입 조회시 같은 타입 둘 이상")
    void findBeanByTypeDuplicate() {

    }

    @Configuration
    static class SameBeanConfig {

    }
}
