package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title provider8003
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\19 0019 15:50
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
public class provider8003 {
    public static void main(String[] args) {
        SpringApplication.run(provider8003.class,args);
    }
}
