package boot.dao;

import boot.entities.dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title deptdao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\15 0015 9:38
 */
@Mapper
public interface deptdao {
    public boolean add(dept d);
    public dept get(Integer did);
    public List<dept> getall();
}
