package com.akai.dao.impl;

import com.akai.dao.EmpDao;
import com.akai.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired  // 容器中已经存在
    private JdbcTemplate jdbcTemplate;

    @Override
    public int findEmpCount() {
        /*查询员工个数
         * queryForObject 两个参数
         * 1 SQL语句
         * 2 返回值类型字节码
         * */
        String sql = "select count(1) from emp";
        return  jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Emp findByEmpNo(int empno) {
        /*
         * 查询单个员工对象
         * queryForObject三个参数
         * 1 SQL语句
         * 2 RowMapper接口的实现类对象,用于指定返回的结果用哪个实体类来进行封装
         * 3 SQL语句中需要传入的参数 (可变参数)
         * */
        String sql = "select * from emp where empno = ?";   // 底层通过 prepareStatement实现,所以这里使用❓占位
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, empno);
    }

    @Override
    public List<Emp> findByDeptNo(int deptno) {
        /*
         * 查询多个员工对象集合
         * query三个参数
         * 1 SQL语句
         * 2 RowMapper接口的实现类对象,用于指定返回的结果用哪个实体类来进行封装
         * 3 SQL语句中需要的参数 (可变参数)
         * */
        String sql = "select * from emp where deptno = ?";
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        List<Emp> query = jdbcTemplate.query(sql, rowMapper, deptno);
        return query;
    }
}
