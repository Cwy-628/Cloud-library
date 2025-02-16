package com.yyy.picturecloudbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.yyy.picturecloudbackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class PictureCloudBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PictureCloudBackendApplication.class, args);
    }

}
