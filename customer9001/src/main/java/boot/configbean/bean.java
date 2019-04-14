package boot.configbean;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title bean
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\15 0015 17:53
 */

@Configuration
public class bean {

    @Bean
    @LoadBalanced
    public RestTemplate get(){
        return new RestTemplate();
    }

    @Bean
    public IRule myrule(){
//        return new RoundRobinRule();   //轮询
        return new RandomRule();     //随机
    }
}
