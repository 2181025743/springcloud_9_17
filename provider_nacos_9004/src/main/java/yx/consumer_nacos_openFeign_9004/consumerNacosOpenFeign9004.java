package yx.consumer_nacos_openFeign_9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class consumerNacosOpenFeign9004 {

    public static void main(String[] args) {
        SpringApplication.run(consumerNacosOpenFeign9004.class, args);
    }

}
