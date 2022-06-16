package com.zb.service;

import com.zb.pojo.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Personservice {
    public List<Person> getAllPerson();

    public List<Person> mingcheng(Integer name);
}
