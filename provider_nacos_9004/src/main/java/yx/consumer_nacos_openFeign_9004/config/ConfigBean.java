package yx.consumer_nacos_openFeign_9004.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * cloud_project
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced

    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
