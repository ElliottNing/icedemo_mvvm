package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Asset;
import com.example.demo.model.LoginReq;
import com.example.demo.model.Pro;
import com.example.demo.model.RegisterReq;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/pro")
public class ProController {


    private static final Integer UU = Math.round(33);

    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody RegisterReq req) {
        System.err.println(req.toString());
        return "{\"status\":\"SUCCESS\"}";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestBody LoginReq req) {
        System.err.println(req.toString());
        return "{\"status\":\"SUCCESS\"}";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String getIndex(Asset req) {
        JSONObject jsonObject = new JSONObject();
        List<Pro> list1 = new ArrayList<>();
        Pro a;
        for (int i = 0; i < 10; i++) {
            a = new Pro();
            a.setId(1 + i);
            a.setName("eri");
            a.setEndTime(new Date());
            a.setLead("领导");
            a.setTeam("队伍");
            a.setPercent(1.0 + i);
            a.setState("状态");
            a.setColor("颜色！");
            list1.add(a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        jsonObject.put("list1",list1);
        return jsonObject.toJSONString();
    }
}
