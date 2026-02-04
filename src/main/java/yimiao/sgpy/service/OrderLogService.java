package yimiao.sgpy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yimiao.sgpy.dao.OrderLogDao;
import yimiao.sgpy.entity.OrderLog;

@Service
public class OrderLogService {
    @Autowired
    private OrderLogDao orderLogDao;

    public void insert(OrderLog orderLog) {
        orderLogDao.insert(orderLog);
    }
}
