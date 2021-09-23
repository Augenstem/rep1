package com.ambow.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class AreaDaoTest {

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
    public void addAreaTest(){

        AreaDao mapper = session.getMapper(AreaDao.class);
        mapper.addArea(new AreaEntity("mybatis测试",new CityEntity(1,"")));
        session.commit();
    }


    @Test
    public void delAreaTest(){
        AreaDao mapper = session.getMapper(AreaDao.class);
        mapper.delArea(18);
        session.commit();
    }


}
