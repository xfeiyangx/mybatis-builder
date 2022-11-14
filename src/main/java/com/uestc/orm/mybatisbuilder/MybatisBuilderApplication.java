package com.uestc.orm.mybatisbuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MybatisBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisBuilderApplication.class, args);
    }

}
