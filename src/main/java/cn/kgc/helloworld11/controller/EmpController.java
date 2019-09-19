package cn.kgc.helloworld11.controller;

import cn.kgc.helloworld11.entities.Emp;
import cn.kgc.helloworld11.pojo.Prop;
import cn.kgc.helloworld11.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Controller
public class EmpController {
    @Resource
    private EmpService empService;

    @GetMapping("/emp")
    public String getAllEmp(Model model){
        List<Emp> list=empService.getAllEmp();
        model.addAttribute("list",list);
        return "empList";
    }
    @GetMapping("/emp/{id}")
    public String getEmpById(@PathVariable("id") Integer integer,Model model){
        Emp emp =empService.getEmpById(integer);
        model.addAttribute("emp",emp);
        return "emp";
    }
    @PostMapping("/emp")
    public String addEmp(Emp emp){
        empService.addEmp(emp);
        return "redirect:emp";
    }
    @PutMapping("/emp")
    public String updateEmp(Emp emp,Model model){
        List<Prop> sexs = new ArrayList<>();
        sexs.add(new Prop("1","男"));
        sexs.add(new Prop("2","女"));
        model.addAttribute("sexs",sexs);
        List<Prop> jobs =new ArrayList<>();
        jobs.add(new Prop("1","菜鸡"));
        jobs.add(new Prop("2","菜鸡2"));
        jobs.add(new Prop("3","菜鸡3"));
        model.addAttribute("jobs",jobs);
        empService.updateEmp(emp);
        return "redirect:emp";
    }
    @DeleteMapping("/emp/{id}")
    public String deleteEmpById(@PathVariable("id") Integer integer){
        empService.deleteEmpByid(integer);
        return "redirect:emp";
    }
    @GetMapping("/emp/view")
    public String toGet(Model model){
        model.addAttribute("emp",new Emp());
        List<Prop> sexs = new ArrayList<>();
        sexs.add(new Prop("1","男"));
        sexs.add(new Prop("2","女"));
        model.addAttribute("sexs",sexs);
        List<Prop> jobs =new ArrayList<>();
        jobs.add(new Prop("1","菜鸡"));
        jobs.add(new Prop("2","菜鸡2"));
        jobs.add(new Prop("3","菜鸡3"));
        model.addAttribute("jobs",jobs);
        System.out.println("hello");
        return "emp";
    }
    @PostMapping("/chong")
    @ResponseBody
    public Boolean chong(Emp emp){
        System.out.println("asd");
       Emp emp2 =  empService.getEmpByName(emp);
       if (emp2 == null){
           return true;
       }
       return false;
    }
}
