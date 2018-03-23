package com.egan.springbootmybatis.controller;

import com.egan.springbootmybatis.dto.Message;
import com.egan.springbootmybatis.dto.MessageStatusEnum;
import com.egan.springbootmybatis.dto.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Controller
 * @Author: gang.wang
 * @Date: Created in 下午2:30 2018/3/23
 */
@RestController
public class MybatisController {

    private static final Logger logger = LoggerFactory.getLogger(MybatisController.class);

    @GetMapping("/index")
    public Message index() {
        logger.info("请求 index");
        Message message = MessageUtil.createEmptyMessage();
        MessageUtil.UpdateMessageStatus(message, MessageStatusEnum.SUCCESS);
        return message;
    }


}
