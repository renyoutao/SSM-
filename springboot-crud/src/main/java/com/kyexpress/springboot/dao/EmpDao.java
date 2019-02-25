package com.kyexpress.springboot.dao;

import com.kyexpress.springboot.domain.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> getAll();

    void add(Emp emp);

   /* void delete(Integer id);

    void update(Emp emp);*/

}
