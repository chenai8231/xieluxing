package com.czf.hello.spring.boot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(value = "com.czf.hello.spring.boot.mybatis.mapper")
@SpringBootApplication
public class HelloSpringBootMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloSpringBootMybatisApplication.class, args);
  }

}
