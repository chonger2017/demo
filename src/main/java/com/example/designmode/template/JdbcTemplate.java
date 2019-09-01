package com.example.designmode.template;

import javax.sql.DataSource;
import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, Object[] values) {

        try {
            //1.获取链接
            Connection coon = dataSource.getConnection();
            //2.创建语句集
            PreparedStatement ps = coon.prepareStatement(sql);
            //3.执行语句集，并且获得结果集
            ResultSet rs = ps.executeQuery();
            //4.解析语句集
            List<?> result = processResult(rs);
            //5.关闭结果
            rs.close();
            //6.关闭语句集
            ps.close();
            //7.关闭链接
            coon.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public abstract List<?> processResult(ResultSet rs);
}
