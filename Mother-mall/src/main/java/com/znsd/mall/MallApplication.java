package com.znsd.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
* 作者：冯福
* 时间：2019年1月26日 下午4:32:41
* 描述：mall启动类
*/
//开启SpringBoot
@SpringBootApplication
//开启Eureka配置，将此服务注册到eureka注册中心
@EnableEurekaClient
//配置扫描mybatis的mapper类
@MapperScan("com.znsd.mall.dao")
public class MallApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(MallApplication.class).web(true).run(args);
	}
	
}
