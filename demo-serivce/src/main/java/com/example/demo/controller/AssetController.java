package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.Asset;
import com.example.demo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    private DemoMapper demoMapper;

    private static final Integer UU = Math.round(33);

    @RequestMapping("/list")
    @ResponseBody
    public String getIndex(Asset req) {
        JSONObject jsonObject = new JSONObject();
        // List<Demo> list1 = demoMapper.selectAll();
        List<Asset> list1 = new ArrayList<>();
        Asset a;
        for (int i = 0; i < 10; i++) {
            a = new Asset();
            a.setId(1 + i);
            a.setTransactionId(1L + i);
            a.setAmount(1.0 + i);
            a.setEndTime(new Date());
            a.setApplicant("eri");
            a.setState(1);
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
