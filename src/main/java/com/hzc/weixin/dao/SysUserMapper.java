package com.hzc.weixin.dao;

import com.hzc.weixin.model.SysUser;

public interface SysUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户名(手机号）查询用户
     * 返回用户
     * @param phone
     * @return
     */
    SysUser selectByPhone(String phone);
}