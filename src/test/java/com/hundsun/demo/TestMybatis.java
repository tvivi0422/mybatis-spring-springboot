package com.hundsun.demo;

import com.hundsun.demo.dao.entity.TbUser;
import com.hundsun.demo.dao.mapper.TbUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;
import java.util.Properties;

/**
 * @Author: tiamw19544
 * @Date: 2023-04-17 10:22
 * @Version: 1.0
 */
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbUser tbUser = sqlSession.selectOne("com.hundsun.malldemo.dao.mapper.TbUserMapper.selectByPrimaryKey", 37L);
//        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);
//        TbUser tbUser = mapper.selectByPrimaryKey(37L);
        System.out.println(tbUser.toString());
    }
    public static void test2(String resource) throws UnsupportedEncodingException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(resource);

        Reader reader = new InputStreamReader(inputStream, "UTF-8");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = builder.build(reader, "development", new Properties());

        SqlSession sqlSession = sqlSessionFactory.openSession();

        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);

        TbUser tbUser = mapper.selectByPrimaryKey(37L);
        System.out.println(tbUser.toString());
    }
}
