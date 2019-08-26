package com.qianbo.staffinterface.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
    @PostMapping("/findEmployees")
    public JSONObject findEmployees(@RequestParam("usercode") String usercode) {
        JSONObject jsonObject=new JSONObject();
        if(usercode.equals("123")) {
            jsonObject.put("reason", "成功的返回");
            jsonObject.put("stat", "1");
            jsonObject.put("usercode", usercode);
            jsonObject.put("username","钱波");
            jsonObject.put("department", "武汉技术开发部");
        }
        if(usercode.equals("111")) {
            jsonObject.put("reason", "成功的返回");
            jsonObject.put("stat", "2");
            jsonObject.put("usercode", usercode);
            jsonObject.put("username","李四");
            jsonObject.put("department", "营运部");
        }
        if(usercode.equals("000")) {
            jsonObject.put("reason", "成功的返回");
            jsonObject.put("stat", "3");
            jsonObject.put("usercode", usercode);
            jsonObject.put("username","王五");
            jsonObject.put("department", "行政部");
        }
        if(!usercode.equals("123") &!usercode.equals("111") &!usercode.equals("000") ) {
            jsonObject.put("reason", "失败的返回");
        }
        return jsonObject;
    }
}
