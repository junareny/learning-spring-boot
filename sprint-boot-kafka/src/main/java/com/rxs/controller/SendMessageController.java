package com.rxs.controller;

import com.rxs.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * 生产者
 */
@RestController
public class SendMessageController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    private String testTopic = "testTopic";
    private String userTopic = "userTopic";

    @GetMapping("/message/send")
    public boolean send(@RequestParam String message){
        System.out.println("[ 收到请求 ]");
        kafkaTemplate.send(testTopic, message);
        System.out.println("[ 返回响应 ]");
        return true;
    }

    @PostMapping("/user/save")
    public boolean saveUser(@RequestBody User user){
        kafkaTemplate.send(userTopic, user);
        return true;
    }

}