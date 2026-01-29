package yimiao.demo;

import com.alibaba.fastjson.JSONObject;

public class WeChat {
    public static void main(String[] args) {
        System.out.println(getOpenId("0d3q5NGa1K3l7L0z0yFa1Kngpz0q5NGn"));
    }

    public static String getOpenId(String code) {
        String appId = "wx7d8ba10c1e15dacb";
        String appSecret = "4e46c24042f68e3f35e69cef55054b55";
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + appSecret + "&js_code=" + code + "&grant_type=authorization_code";
        String response = Utils.sendGet(url, null);
        JSONObject jsonObject = JSONObject.parseObject(response);
        if (jsonObject == null || jsonObject.get("openid") == null) {
            return null;
        }
        return jsonObject.get("openid").toString();

    }
}
