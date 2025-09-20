package yx.nacos_config_7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.concurrent.TimeUnit;

@RefreshScope
@SpringBootApplication
public class nacos_config {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(nacos_config.class, args);
        Environment env = context.getEnvironment();

        // 添加死循环，每2秒读取一次配置
        while (true) {
            String userName = env.getProperty("student.name");  // 避免user.name冲突
            String userAge = env.getProperty("student.age");

            System.out.println("用户名：" + userName);
            System.out.println("年龄：" + userAge);

            // 休眠2秒
            TimeUnit.SECONDS.sleep(2);
        }
    }
}