package com.ambow.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ProvinceDaoTest {

    SqlSession session = null;


    //每次执行test之前先执行before
    @Before
    public void testBefore() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession() ;
    }


    @Test
    public void testAll() throws IOException {

        ProvinceDao mapper = session.getMapper(ProvinceDao.class);
        List<ProvinceEntity> list = mapper.allProvince();
        for (ProvinceEntity item:list){
            System.out.println(item);
        }
    }



    @Test
    public void testAdd() throws IOException {

        ProvinceDao mapper = session.getMapper(ProvinceDao.class);
        mapper.addProvince("ssm测试");
        session.commit();
        System.out.println("添加成功！！！");
    }


    @Test
    public void testUpdate() throws IOException {

        ProvinceDao mapper = session.getMapper(ProvinceDao.class);
        mapper.updateProvince(new ProvinceEntity(22,"x"));
        session.commit();
    }


    @Test
    public void testDel() throws IOException {

        ProvinceDao mapper = session.getMapper(ProvinceDao.class);
        mapper.delProvince(25);
        session.commit();
    }




}
