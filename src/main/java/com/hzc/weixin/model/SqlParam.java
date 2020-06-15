package com.hzc.weixin.model;


/**
 * Created by fy on 2017/7/24.
 */
public class SqlParam {

    private String sql;
    private String[] params;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }
}
