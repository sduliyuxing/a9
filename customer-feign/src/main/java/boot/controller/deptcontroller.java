package boot.controller;


import boot.entities.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import boot.service.servicefeign;

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

    @Autowired
    servicefeign service;

    @PostMapping("/customer/add")
    public boolean add(@RequestBody dept d){
        return this.service.add(d);
    }

    @GetMapping("/customer/get/{did}")
    public dept get(@PathVariable("did") Integer did){
        return service.get(did);
    }

    @GetMapping("/customer/getall")
    public List<dept> getall(){
        return service.getall();
    }

}