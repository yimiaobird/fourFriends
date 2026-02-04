package yimiao.sgpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import yimiao.sgpy.entity.OrderLog;
import yimiao.sgpy.service.OrderLogService;

@Controller
@RequestMapping(value = "/orderlog")
public class OrderLogController {
    @Autowired
    private OrderLogService orderLogService;

    @RequestMapping(value = "/insert")
    public void insert(@RequestBody OrderLog orderLog) {
        orderLogService.insert(orderLog);
    }
}
