package boot.service.serviceimpl;

import boot.dao.deptdao;
import boot.service.deptservice;
import boot.entities.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title serviceimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\15 0015 10:19
 */

@Service
public class serviceimpl implements deptservice {

    @Autowired
    private deptdao dao;

    @Override
    public boolean add(dept d) {
        return dao.add(d);
    }

    @Override
    public dept get(Integer did) {
        return dao.get(did);
    }

    @Override
    public List<dept> getall() {
        return dao.getall();
    }
}
