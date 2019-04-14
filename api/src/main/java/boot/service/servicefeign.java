package boot.service;

import boot.entities.dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Title servicefeign
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\20 0020 16:06
 */

@FeignClient(value = "PROVIDER",fallbackFactory = Fallback.class)
public interface servicefeign {

    @PostMapping("/dept/add")
    public boolean add(@RequestBody dept d);

    @GetMapping("/dept/get/{did}")
    public dept get(@PathVariable("did") Integer did);

    @GetMapping("/dept/getall")
    public List<dept> getall();
}
