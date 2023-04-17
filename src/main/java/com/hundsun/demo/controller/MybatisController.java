package com.hundsun.demo.controller;

import com.hundsun.demo.dao.entity.TbUser;
import com.hundsun.demo.dao.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tiamw19544
 * @Date: 2023-04-17 13:01
 * @Version: 1.0
 */
@RestController
public class MybatisController {

    @Autowired
    private TbUserMapper tbUserMapper;

    @RequestMapping("/testMybatis")
    public String testMybatis() {
        TbUser tbUser = this.tbUserMapper.selectByPrimaryKey(37L);
        return tbUser.getUsername();
    }
}
