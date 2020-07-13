package com.dyzwj;

import com.dyzwj.api.UserInterface;
import com.dyzwj.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.function.Consumer;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ConsumerApp.java
 * @Description TODO
 * @createTime 2020年07月13日 16:05:00
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }


    @Component
    public class UserServiceTest implements CommandLineRunner{


        private final Logger logger = LoggerFactory.getLogger(getClass());


        @Resource
        private UserInterface userServiceImpl;

        @Override
        public void run(String... args) throws Exception {
            UserDto userDto = userServiceImpl.sayHello(1);
            logger.info("userDto:{}",userDto);
        }
    }



}
