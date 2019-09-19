package cn.kgc.helloworld11.service;

import cn.kgc.helloworld11.entities.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    public List<Emp> getAllEmp();
    public Emp getEmpById(Integer integer);
    public void addEmp(Emp emp);
    public void updateEmp(Emp emp);
    public void deleteEmpByid(Integer integer);
    public Emp getEmpByName(Emp emp);
}
