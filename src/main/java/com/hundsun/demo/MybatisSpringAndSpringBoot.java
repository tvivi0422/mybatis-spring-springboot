package com.hundsun.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hundsun.demo.dao.mapper")
public class MybatisSpringAndSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringAndSpringBoot.class, args);
	}

}
