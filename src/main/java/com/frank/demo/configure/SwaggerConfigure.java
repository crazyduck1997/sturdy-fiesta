package com.frank.demo.configure;

import com.frank.demo.model.po.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

/**
 * @Author frank
 * @date 2023/1/5 18:45
 * @Description
 */
@Configuration
@EnableOpenApi
public class SwaggerConfigure {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH,1);
        instance.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(instance.getTime());


    }
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                // 是否开启
                .enable(true)//true
                .select()
                .apis(basePackage("com.frank.demo.controller"))
//                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("资源中心swagger业务")
                //创建人
                .contact(new Contact("clc", "http://www.baidu.com", "clc@x.com"))
                .version("1.0")
                .description("不需要描述")
                .build();
    }

}
