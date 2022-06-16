package com.zb.service.impl;

import com.zb.mapper.Deptmapper;
import com.zb.pojo.Dept;
import com.zb.service.Deptservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Deptserviceimpl implements Deptservice {
    @Resource
    Deptmapper deptmapper;

    @Override
    public List<Dept> getAllger() {
        return deptmapper.getAllger();
    }
}
