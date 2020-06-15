package com.hzc.weixin.service;

import com.hzc.framework.ssh.repository.jdbc.DBUtil;
import com.hzc.framework.ssh.repository.jdbc.JdbcException;
import com.hzc.framework.ssh.service.Context;
import com.hzc.framework.ssh.service.TrancationType;
import com.hzc.framework.ssh.service.Transaction;
import com.hzc.weixin.model.SqlParam;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * Created by fy on 2017/7/24.
 */
@Transaction
public class DBService {


    /**
     * 根据用户名（手机）获取用户信息
     * 返回用户信息
     *
     * @param sqlParam
     * @return
     */
    public List<Map<String, Object>> select(SqlParam sqlParam) throws JdbcException, UnsupportedEncodingException {
        List<Map<String, Object>> maps = DBUtil.queryMapListForEncode(Context.getSqlSession().getConnection(), sqlParam.getSql(), sqlParam.getParams());
//        for (Map<String, Object> map : maps) {
//            for (String key : map.keySet()) {
//                String value = map.get(key).toString();
//                if (StringUtils.contains(value, "<")) {
//                    map.put(key, URLEncoder.encode(value, "UTF-8"));
//                }
//            }
//        }
        return maps;
    }


    @Transaction(jdbc = TrancationType.OPEN)
    public boolean execute(SqlParam sqlParam) throws JdbcException {
        return DBUtil.execute(Context.getSqlSession().getConnection(), sqlParam.getSql(), sqlParam.getParams()) != 0;
    }
}
