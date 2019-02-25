package com.kyexpress.springboot.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：RYT
 * @date ：Created in 2019/2/16 0016 19:33
 * @description：员工信息实体类
 * @modified By：
 * @version: 1.0.0
 */
public class Emp implements Serializable {

    private Integer id;
    private String name;
    private String lastName;
    private Integer gender;
    private Date birthDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                '}';
    }
}
