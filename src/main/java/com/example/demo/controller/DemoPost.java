package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoPost {


    @RequestMapping("/cmdlog/{count}")
    public String cmdlogs(@PathVariable("count") String count, @RequestParam(name = "logs") String logs) {
        for (int i = 1; i <= Integer.parseInt(count); i++) {
            System.out.println("日志报错问题:" + logs);
        }
        return "共计执行" + count + "次,日志关键词是" + logs;
    }

    @RequestMapping("/path/{count}")
    public String pathlogs(@PathVariable("count") String count, @RequestParam(name = "logs") String logs) {
        System.out.println("是否进入此接口");
        for (int i = 1; i < Integer.parseInt(count); i++) {
//            log.debug("debug:" + logs);
//            log.warn("warn:" + logs);
//            log.info("info:" + logs);
            log.error("error:" + logs);
        }
        return "共计执行" + count + "次,日志关键词是" + logs;
    }

    @RequestMapping("/help")
    public String help() {
        return "/日志内容/次数";
    }

    @RequestMapping("/")
    public String HelloWorld() {
        return "欢迎来到HF的页面";
    }
}
