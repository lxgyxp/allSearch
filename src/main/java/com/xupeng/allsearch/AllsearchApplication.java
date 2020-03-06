package com.xupeng.allsearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@MapperScan(value = "com.xupeng.allsearch.mapper")
public class AllsearchApplication  extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(AllsearchApplication.class, args);
	}

	// 配置静态资源文件路径
	// @Override
   protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")
				.addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
		super.addResourceHandlers(registry);
	}

}
