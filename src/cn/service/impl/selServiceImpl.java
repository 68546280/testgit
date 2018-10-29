package cn.service.impl;

import cn.dao.SelGetAll;
import cn.service.selService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository("ssi")
public class selServiceImpl implements selService {
    @Resource
    private SelGetAll sga;
    public SelGetAll getSga() {
        return sga;
    }

    public void setSga(SelGetAll sga) {
        this.sga = sga;
    }
    @Override
    public String selGet() {
        System.out.println(sga.selAll());
        return JSON.toJSONString(sga.selAll());
    }
}
