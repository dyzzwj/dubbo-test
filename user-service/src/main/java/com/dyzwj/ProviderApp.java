package com.dyzwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ProviderApp.java
 * @Description TODO
 * @createTime 2020年07月13日 15:47:00
 */

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
