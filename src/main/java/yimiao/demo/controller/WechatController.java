package yimiao.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yimiao.demo.service.WeChatService;
import yimiao.demo.utils.ErrCode;

@Controller
@RequestMapping(value = "/wechat")
public class WechatController {
    @Autowired
    private WeChatService weChatService;

    @ResponseBody
    @RequestMapping("/getOpenId")
    public ErrCode getOpenId(String code) {
        return weChatService.getOpenId(code);
    }
}
