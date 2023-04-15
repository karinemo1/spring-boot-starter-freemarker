package com.freemarker.demo.controller;

import com.freemarker.demo.vo.NormVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreemarkerController {

    @GetMapping("/example")
    public String example(ModelMap model) {
        Map<String, List<Object>> instanceMap = new HashMap<>();
        List<Object> list = new ArrayList<>();
        NormVo normVo1 = new NormVo();
        normVo1.setNum(1);
        normVo1.setName("queue1");
        normVo1.setType("问题1");
        NormVo normVo2 = new NormVo();
        normVo2.setNum(2);
        normVo2.setName("queue2");
        normVo2.setType("问题2");
        list.add(normVo1);
        list.add(normVo2);
        instanceMap.put("instance1",list);

        // 将数据放入 instanceMap 中
        model.addAttribute("instanceMap", instanceMap);
        model.addAttribute("date","莫华美");
        return "example"; // 假设 "example" 是您的 Freemarker 模板名称
    }

    @RequestMapping("/test")
    public String testFreemarker(ModelMap modelMap){
        modelMap.addAttribute("msg", "Welcome! , this is freemarker");
        return "freemarker";
    }

}
