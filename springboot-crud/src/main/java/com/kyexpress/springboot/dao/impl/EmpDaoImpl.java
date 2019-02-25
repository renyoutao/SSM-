package com.kyexpress.springboot.dao.impl;

import com.kyexpress.springboot.dao.EmpDao;
import com.kyexpress.springboot.domain.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：RYT
 * @date ：Created in 2019/2/16 0016 22:06
 * @description：员工持久层实现类
 * @modified By：
 * @version: 1.0.0
 */
@Repository
public class EmpDaoImpl implements EmpDao {

    private ThreadLocal<List<Emp>> init() {
        ThreadLocal<List<Emp>> list = new ThreadLocal<List<Emp>>();
        List<Emp> emps = new ArrayList<>();
        Emp emp = new Emp();
        emp.setId(1);
        emp.setName("张三");
        emp.setLastName("张三");
        emp.setGender(1);
        emp.setBirthDay(new Date());
        emps.add(emp);
        emp = new Emp();
        emp.setId(2);
        emp.setName("王五");
        emp.setLastName("王五");
        emp.setGender(0);
        emp.setBirthDay(new Date());
        emps.add(emp);
        emp = new Emp();
        emp.setId(3);
        emp.setName("李四");
        emp.setLastName("李四");
        emp.setGender(1);
        emp.setBirthDay(new Date());
        emps.add(emp);
        emp = new Emp();
        emp.setId(4);
        emp.setName("王五");
        emp.setLastName("王五");
        emp.setGender(1);
        emp.setBirthDay(new Date());
        emps.add(emp);
        list.set(emps);
        return list;
    }

    @Override
    public List<Emp> getAll() {

        return init().get();
    }

    @Override
    public void add(Emp emp) {
        ThreadLocal<List<Emp>> list=init();
        if(list.get()!=null){
            list.get().add(emp);
        }
    }

    /*@Override
    public void delete(Integer id) {
        for (Emp emp : list.get()) {
            if (emp.getId().equals(id)) {
                list.get().remove(emp);
            }
        }
    }

    @Override
    public void update(Emp emp) {
        for (Emp empL : list.get()) {
            if (empL.getId().equals(emp.getId())) {
                list.get().remove(emp);
            }
        }
        list.get().add(emp);
    }*/
}
