package com.hzc.weixin.service;

import com.hzc.weixin.model.SysUser;
import com.hzc.weixin.util.factory.alias.D;
import com.hzc.framework.ssh.service.Transaction;

/**
 * Created by paulliu88 on 2015/3/4.
 */
@Transaction
public class AppUserService {


    /**
     * 根据用户名（手机）获取用户信息
     * 返回用户信息
     *
     * @param phone
     * @return
     */
    public SysUser getUserByPhone(String phone) {
        return D.sysUserMapper().selectByPhone(phone);
    }

}
