package cn.controller;

import cn.pojo.Myxx;
import cn.service.selService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("test/")
@Controller

public class TestController {
    @Autowired
    @Qualifier("ssi")
    private selService ss;

    public selService getSs() {
        return ss;
    }

    public void setSs(selService ss) {
        this.ss = ss;
    }

    @RequestMapping(value = "seluser")
    @ResponseBody
    public String sad(@RequestBody Myxx mx){
        String aaa = mx.getMid() + "--------" + mx.getMname();
        System.out.println(aaa);
        String s = JSON.toJSONString(aaa);
        return s;
    }
    @RequestMapping(value = "selget")
    @ResponseBody
    public String sd(){
        System.out.println(ss.selGet()+"con");
        return ss.selGet();
    }
}
