package com.hzc.weixin.util.factory;

import com.hzc.weixin.dao.SysUserMapper;
import com.hzc.framework.ssh.service.Context;

/**
 * Created by YinBin on 14-4-21.
 */
public class DaoFactory {

    public static <T> T get(Class<T> t) {
        return Context.getSqlSession().getMapper(t);
    }

    public static SysUserMapper sysUserMapper() {
        return get(SysUserMapper.class);
    }


}
