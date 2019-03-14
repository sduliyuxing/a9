package boot.controller;

import boot.service.deptservice;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import boot.entities.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title deptcontroller
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\15 0015 10:22
 */
@RestController
public class deptcontroller {

    @Autowired
    private deptservice service;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody dept d){
        return service.add(d);
    }

    @GetMapping("/dept/get/{did}")
    @HystrixCommand(fallbackMethod = "roll")
    public dept get(@PathVariable("did") Integer did) {
        dept d=service.get(did);
        if (d==null){
            throw new RuntimeException("cuowu");
        }
        return service.get(did);
    }

    @GetMapping("/dept/getall")
    public List<dept> getall(){
        return service.getall();
    }

   public dept roll(@PathVariable("did") Integer did){
        dept d=new dept();
        d.setDname("错误");
        return d;
   }
}
