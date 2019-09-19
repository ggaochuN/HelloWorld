package cn.kgc.helloworld11;

import cn.kgc.helloworld11.entities.Emp;
import cn.kgc.helloworld11.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Helloworld11ApplicationTests {
    @Resource
    private EmpMapper empMapper;
    @Test
    public void contextLoads() {
        List<Emp> list = empMapper.selectAll();
        list.forEach (System.out::println);
    }

}
