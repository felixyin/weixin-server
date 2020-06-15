package com.hzc.weixin.ctrl;

import com.hzc.framework.ssh.repository.jdbc.JdbcException;
import com.hzc.weixin.model.SqlParam;
import com.hzc.weixin.util.factory.alias.S;
import com.hzc.weixin.util.factory.alias.W;

import java.io.UnsupportedEncodingException;

/**
 * Created by fy on 2017/7/24.
 */
public class DBCtrl {

    public void select() throws JdbcException, UnsupportedEncodingException {
        W.writeJsonArray(S.getDBService().select(W.packBean(SqlParam.class)));
    }

    public void execute() throws JdbcException {
        W.writeJson(S.getDBService().execute(W.packBean(SqlParam.class)), null);
    }
}
