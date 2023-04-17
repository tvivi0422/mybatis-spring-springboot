package com.hundsun.demo.controller;

import com.hundsun.demo.dao.entity.TbUser;
import com.hundsun.demo.dao.mapper.TbUserMapper1;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tiamw19544
 * @Date: 2023-04-17 13:01
 * @Version: 1.0
 */
@RestController
public class MybatisController1 {
    @Autowired
    private TbUserMapper1 tbUserMapper1;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @RequestMapping("/testMybatis1")
    public String testMybatis1() {
        TbUserMapper1 mapper = sqlSessionTemplate.getMapper(TbUserMapper1.class);
        TbUser tbUser = mapper.selectByPrimaryKey(37L);
        return tbUser.getUsername();
    }

    @RequestMapping("/testMybatis2")
    public String testMybatis2() {
        TbUser tbUser = tbUserMapper1.selectByPrimaryKey(37L);
        return tbUser.getUsername();
    }
}
