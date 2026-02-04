package yimiao.sgpy.dao;

import org.springframework.stereotype.Repository;
import yimiao.sgpy.entity.OrderLog;

@Repository
public interface OrderLogDao {
    void insert(OrderLog orderLog);

}
