package com.huajiang.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.example.config
 * @date 2020/2/9 上午10:46
 * @Copyright
 */
/*
@EnableAutoConfiguration(exclude = {DefaultConfig.class})//You need to opt-in to auto-configuration by adding the
*/
// @EnableAutoConfiguration to enable Spring Boot’s auto-configuration mechanism
// or @SpringBootApplication annotations to one of your @Configuration classes.

@Configuration //@Configuration class. Usually the class that defines the main method is a good candidate as the primary @Configuration.

@Import({DefaultConfig.class}) //annotation can be used to import additional configuration classes

@ImportResource //load XML configuration files
public class MyConfig {
}
