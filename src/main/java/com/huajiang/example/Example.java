package com.huajiang.example;

import com.huajiang.example.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.example
 * @date 2020/2/9 上午9:29
 * @Copyright
 */
@RestController
//tells spring boot to "guss" how you want to configure Spring,based on the jar dependencies
// that you have added.Since spring-boot-starter-web add Tomcat and SpringMVC,the autoconfiguration
// assumes that you are developing a web application and sets up spring accordingly.
// If you don't want use "@SpringBootApplication" ,you can use @EnableAutoConfiguration
// and @ComponentScan instead,that means @SpringBootApplication same as
// @EnableAutoConfiguration,@EnableAutoConfiguration, @ComponentScan
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Example{
    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        /**
         *  	The constructor arguments passed to SpringApplication are configuration sources for Spring beans.
         *  	In most cases, these are references to @Configuration classes,
         *  	but they could also be references to XML configuration or
         *  	to packages that should be scanneds
         */
        SpringApplication springApplication = new SpringApplication(MyConfig.class);
        springApplication.setLazyInitialization(true);
        springApplication.run(Example.class,args);
    }

}
