package com.zb.mapper;

import com.zb.pojo.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Personmapper {
    public List<Person> getAllPerson();

    public List<Person> mingcheng(@Param("deptname") Integer name);

  /*  public int tianjia(Person person);

    public int delt(int a);*/

}
