package com.hzc.weixin.ctrl;

import com.hzc.weixin.util.factory.alias.S;
import com.hzc.weixin.util.factory.alias.W;
import com.hzc.framework.ssh.controller.WebUtil;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LiuJY on 2015/3/20.
 */
public class UserCtrl {

    public void test() {
        W.writeJson(true, "ok");
    }

    /**
     * 服务端登录后台
     */
    public void login() {
        String userName = WebUtil.getString("userName");
        String password = WebUtil.getString("password");
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            throw new IllegalArgumentException("arguments are null");
        }
        if (userName.trim().equals("sunlaoshi") && password.trim().equals("111111")) {
            WebUtil.forward("/WEB-INF/enrollment/enrollManage.jsp");
        } else {
            HttpServletRequest req = WebUtil.getReq();
            req.setAttribute("message", "用户名密码错误");
            WebUtil.forward("/index.jsp");
        }
    }

}
