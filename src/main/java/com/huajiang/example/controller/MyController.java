package com.huajiang.example.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.data.repository.Repository;
import javax.persistence.Entity;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.example.controller
 * @date 2020/2/9 下午2:33
 * @Copyright
 */
@EnableCaching
@Controller
//If you want to disable lazy initialization for certain beans
// while using lazy initialization for the rest of the application
@Lazy(false)
public class MyController {

   @Cacheable
    public void test(int i){

    }
}
