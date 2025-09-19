package yx.provider_nacos_9002.config;

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

    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
