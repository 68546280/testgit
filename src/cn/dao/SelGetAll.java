package cn.dao;

import cn.pojo.Myxx;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface SelGetAll {
    /**
     * 查全部
     * @return
     */
    List<Myxx> selAll();
}
