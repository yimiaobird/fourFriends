package yimiao.sgpy.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import yimiao.sgpy.utils.ErrCode;
import yimiao.sgpy.utils.Utils;

@Service
public class WechatService {
    @Value("${wechat.app_id}")
    private String appId;
    @Value("${wechat.app_secret}")
    private String appSecret;
    public ErrCode getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + appSecret + "&js_code=" + code + "&grant_type=authorization_code";
        String response = Utils.sendGet(url, null);
        JSONObject jsonObject = JSONObject.parseObject(response);
        if (jsonObject == null) {
            return new ErrCode(1, "获取openid接口访问失败");
        }
        Object openId = jsonObject.get("openid");
        if (openId == null) {
            return new ErrCode(2, "获取openid失败，openid为空");
        }
        return new ErrCode(0, openId.toString());
    }
}
