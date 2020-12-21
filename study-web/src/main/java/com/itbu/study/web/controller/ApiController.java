package com.itbu.study.web.controller;

import com.itbu.study.common.bean.UserBean;
import com.itbu.study.common.result.JsonResult;
import com.itbu.study.mqtt.MqttMessageSender;
import com.itbu.study.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final MqttMessageSender mqttMessageSender;

    public ApiController(MqttMessageSender mqttMessageSender, UserService userService){
        this.mqttMessageSender = mqttMessageSender;
        this.userService = userService;
    }

    private final UserService userService;

    @RequestMapping("/index")
    public List<UserBean> index(){
        return userService.getAll();
    }

    @RequestMapping("/mqtt")
    public JsonResult<?> mqtt_sender(@RequestParam("msg")String msg){
        logger.info("Send mqtt msg: {}", msg);
        mqttMessageSender.sendToMqtt(msg);
        logger.info("Send successfully!");
        return new JsonResult<>(0,"Send Successfully");
    }

}
