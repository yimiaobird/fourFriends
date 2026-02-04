package yimiao.sgpy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yimiao.sgpy.service.WechatService;
import yimiao.sgpy.utils.ErrCode;
import yimiao.sgpy.utils.Utils;


@Controller
@RequestMapping(value = "/wechat")
public class WechatController {
    @Autowired
    private WechatService weChatService;
    @ResponseBody
    @RequestMapping("/getOpenId")
    public ErrCode getOpenId(String code) {
        return weChatService.getOpenId(code);
    }
}
