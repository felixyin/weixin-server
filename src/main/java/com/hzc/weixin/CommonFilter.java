package com.hzc.weixin;

import com.hzc.framework.ssh.controller.ActionContext;
import com.hzc.framework.ssh.controller.WebUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by LiuJY on 2015/3/24.
 */
@WebFilter(filterName = "CommonFilter")
public class CommonFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        try {
            chain.doFilter(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            WebUtil.writeJson(false, ActionContext.get("ValidationError", ""));
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
