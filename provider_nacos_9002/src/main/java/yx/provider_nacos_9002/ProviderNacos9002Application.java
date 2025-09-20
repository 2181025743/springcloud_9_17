package yx.provider_nacos_9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderNacos9002Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderNacos9002Application.class, args);
    }

}
