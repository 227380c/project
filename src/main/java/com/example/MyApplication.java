package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//mapper 接口类扫描包配置
@MapperScan("com.example.dao")
@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyApplication.class, args);
	}
}
