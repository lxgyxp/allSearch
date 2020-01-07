package com.xupeng.allsearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xupeng.allsearch.mapper")
public class AllsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllsearchApplication.class, args);
	}

}
