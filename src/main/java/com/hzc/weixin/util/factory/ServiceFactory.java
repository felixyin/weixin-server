package com.hzc.weixin.util.factory;

import com.hzc.weixin.service.AppUserService;
import com.hzc.weixin.service.DBService;

/**
 * @author yinbin
 */

public class ServiceFactory {

    public static <T> T get(Class<T> t) {
        return com.hzc.framework.ssh.service.ServiceFactory.getInstance(t);
    }

    public static AppUserService appUserService() {
        return get(AppUserService.class);
    }

    public static DBService getDBService(){
        return get(DBService.class);
    }
}

