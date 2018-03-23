package com.egan.springbootmybatis.controller;

import com.egan.springbootmybatis.dto.Message;
import com.egan.springbootmybatis.dto.MessageStatusEnum;
import com.egan.springbootmybatis.dto.MessageUtil;
import com.egan.springbootmybatis.model.SysRole;
import com.egan.springbootmybatis.service.SysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: Controller
 * @Author: egan
 * @Date: Created in 下午2:57 2018/3/23
 */
@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private SysRoleService service;

    @GetMapping("/index")
    public Message index() {
        Message message = MessageUtil.createEmptyMessage();
        MessageUtil.UpdateMessageStatus(message, MessageStatusEnum.SUCCESS);
        return message;
    }

    @GetMapping("/sysinfo")
    public Message sysRoleInfo() {
        Message message = MessageUtil.createEmptyMessage();
        List<SysRole> list = service.getSysRole();
        Map map = new HashMap();
        map.put("roles",list);
        message.getBody().setOutParams(map);
        MessageUtil.UpdateMessageStatus(message, MessageStatusEnum.SUCCESS);
        return message;
    }




}
