package boot.service;

import boot.entities.dept;

import java.util.List;

public interface deptservice {
    public boolean add(dept d);
    public dept get(Integer did);
    public List<dept> getall();
}
