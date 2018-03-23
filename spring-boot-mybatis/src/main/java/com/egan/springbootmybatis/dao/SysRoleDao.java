package com.egan.springbootmybatis.dao;

import com.egan.springbootmybatis.model.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: Dao
 * @Author: egan
 * @Date: Created in 上午11:57 2018/3/23
 */
@Repository
public interface SysRoleDao {

    List<SysRole> querySysRoleIdAndName();
}
