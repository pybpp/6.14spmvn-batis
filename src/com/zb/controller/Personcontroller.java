package com.zb.controller;

import com.zb.pojo.Dept;
import com.zb.pojo.Person;
import com.zb.service.Deptservice;
import com.zb.service.Personservice;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Personcontroller {
    @Resource
    Personservice personservice;
    @Resource
    Deptservice deptservice;

    @RequestMapping("/getAll")
    public String getAllger(Model model){
        List<Person> allPerson = personservice.getAllPerson();
        model.addAttribute("persons",allPerson);
        return "index";
    }
    @RequestMapping("/getAll2")
    public String mingcheng(Integer name,Model model){
        List<Person> allPerson=personservice.mingcheng(name);

        List<Dept> depts = deptservice.getAllger();
        model.addAttribute("depts",depts);
        model.addAttribute("person2",allPerson);
        return "index";
    }



}
