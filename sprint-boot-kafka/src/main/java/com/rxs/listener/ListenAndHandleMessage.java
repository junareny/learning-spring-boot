package com.rxs.listener;

import com.rxs.bean.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 任务处理器，监听kafka队列中的消息，消费并处理
 */

@Component
public class ListenAndHandleMessage {

    @KafkaListener(topics = "testTopic")
    public void onMessage(String message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println("[ 处理器开始处理消息 ]" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(message);
        System.out.println("[ 处理器处理消息完成 ]" + System.currentTimeMillis());
    }

    @KafkaListener(topics = "userTopic")
    public void onMessage(User user){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println("[ 处理器开始处理消息 ]" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        System.out.println("[ 处理器处理消息完成 ]" + System.currentTimeMillis());
    }

}