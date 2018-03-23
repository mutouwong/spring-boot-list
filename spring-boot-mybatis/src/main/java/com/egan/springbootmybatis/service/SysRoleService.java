package com.egan.springbootmybatis.service;

import com.egan.springbootmybatis.dao.SysRoleDao;
import com.egan.springbootmybatis.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: gang.wang
 * @Date: Created in 下午4:20 2018/3/23
 */
@Service
public class SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    public List<SysRole> getSysRole() {
        return sysRoleDao.querySysRoleIdAndName();
    }

}
