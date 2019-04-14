package boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title provider8001
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\14 0014 17:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //熔断机制
public class provider_hystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(provider_hystrix8001.class,args);
    }
}
