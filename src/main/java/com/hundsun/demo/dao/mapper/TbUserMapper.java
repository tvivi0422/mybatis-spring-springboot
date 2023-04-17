package com.hundsun.demo.dao.mapper;

import com.hundsun.demo.dao.entity.TbUser;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper {
    TbUser selectByPrimaryKey(Long id);
}
