package boot.controller;

import boot.entities.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Title deptcontroller
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\15 0015 17:56
 */
@RestController
public class deptcontroller {

//    private static final String pr = "http://localhost:8001";
      private static final String pr = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;


//      ResponseBean.class这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。


    @RequestMapping(value = "/customer/add",method = RequestMethod.POST)
    public boolean add(dept d) {
        return restTemplate.postForObject(pr + "/dept/add", d, boolean.class);
    }

    @RequestMapping(value = "/customer/get/{did}",method = RequestMethod.GET)
    public dept get(@PathVariable("did") Integer did) {
        return restTemplate.getForObject(pr + "/dept/get/" + did, dept.class);
    }

    @RequestMapping(value = "/customer/getall",method = RequestMethod.GET)
    public List<dept> getall(){
        return restTemplate.getForObject(pr+"/dept/getall",List.class);
    }
}