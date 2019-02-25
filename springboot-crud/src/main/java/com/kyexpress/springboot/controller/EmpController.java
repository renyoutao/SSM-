package com.kyexpress.springboot.controller;

import com.kyexpress.springboot.dao.EmpDao;
import com.kyexpress.springboot.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Random;

/**
 * @author ：RYT
 * @date ：Created in 2019/2/16 0016 18:36
 * @description：员工请求控制器
 * @modified By：
 * @version: 1.0.0
 */
@Controller
public class EmpController {

    @Autowired
    private EmpDao empDao;

    @GetMapping("/emps")
    public String list(Model model) {
        List<Emp> emps = empDao.getAll();
        model.addAttribute("emps", emps);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String addPage() {
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Emp emp) {
        emp.setId(new Random().nextInt());
        System.out.println(emp);
        empDao.add(emp);
        return "redirect:/emps";
    }
}
