package yimiao.sgpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import yimiao.sgpy.entity.Orderlog;
import yimiao.sgpy.service.OrderlogService;

@RequestMapping("orderlog")
@Controller
public class OrderlogController {
    @Autowired
    private OrderlogService orderlogService;

    @RequestMapping("insert")
    public void insert(@RequestBody Orderlog orderlog) {
        orderlogService.insert(orderlog);
    }
}
