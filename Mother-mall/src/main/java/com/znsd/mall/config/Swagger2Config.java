package com.znsd.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
* 作者：冯福
* 时间：2019年1月26日 下午8:07:08
* 描述：swagger配置类
*/
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket createRestApi() {
		//创建API页面展示信息
		ApiInfo apiInfo = new ApiInfoBuilder()
				//页面APIswagger-ui.html的标题
				.title("母婴商城demo测试")
				//描述下的链接信息
				.contact(new Contact("Loyal", "http://localhost:8080/toLogin", ""))
				//版本号 页面标题上显示的版本号
				.version("1.0")
				//页面API文档的描述信息
				.description("API 描述").build();
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis
					(
						RequestHandlerSelectors.basePackage("com.znsd.mall.action")
					)
				.paths(PathSelectors.any())
				.build();
	}
}
