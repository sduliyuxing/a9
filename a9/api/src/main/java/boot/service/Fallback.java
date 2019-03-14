package boot.service;

import boot.entities.dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Title fallbackfactory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\21 0021 16:51
 */

@Component
public class Fallback implements FallbackFactory<servicefeign> {
    @Override
    public servicefeign create(Throwable cause) {
        return new servicefeign() {
            @Override
            public boolean add(dept d) {
                return false;
            }

            @Override
            public dept get(Integer did) {
                dept d=new dept();
                d.setDname("....错误....");
                return d;
            }

            @Override
            public List<dept> getall() {
                return null;
            }
        };
    }
}
