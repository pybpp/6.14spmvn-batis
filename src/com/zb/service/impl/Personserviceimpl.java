package com.zb.service.impl;

import com.zb.mapper.Personmapper;
import com.zb.pojo.Person;
import com.zb.service.Personservice;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Personserviceimpl implements Personservice {
    @Resource
    Personmapper personmapper;




    @Override
    public List<Person> getAllPerson() {
        return personmapper.getAllPerson();
    }

    @Override
    public List<Person> mingcheng(Integer name) {
        return personmapper.mingcheng(name);

    }
}
