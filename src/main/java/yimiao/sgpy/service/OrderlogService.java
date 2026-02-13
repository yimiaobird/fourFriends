package yimiao.sgpy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yimiao.sgpy.entity.Orderlog;
import yimiao.sgpy.mapper.OrderlogMapper;

@Service
public class OrderlogService {
    @Autowired
    private OrderlogMapper orderlogMapper;

    public void insert(Orderlog orderlog) {
        orderlogMapper.insert(orderlog);
    }
}
