package tdoo.demo.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

// @EnableAsync
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAopApplication.class, args);
    }

}
