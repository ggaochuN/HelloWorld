package cn.kgc.helloworld11.service.ServiceImpl;



import cn.kgc.helloworld11.entities.Emp;
import cn.kgc.helloworld11.mapper.EmpMapper;
import cn.kgc.helloworld11.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empmapper;
    @Override
    public List<Emp> getAllEmp() {
        return empmapper.selectAll();
    }

    @Override
    public Emp getEmpById(Integer integer) {
        return empmapper.selectByPrimaryKey(integer);
    }

    @Override
    public void addEmp(Emp emp) {
        empmapper.insert(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empmapper.updateByPrimaryKey(emp);
    }

    @Override
    public void deleteEmpByid(Integer integer) {
    empmapper.deleteByPrimaryKey(integer);
    }

    @Override
    public Emp getEmpByName(Emp emp) {
        return empmapper.selectOne(emp);
    }
}
