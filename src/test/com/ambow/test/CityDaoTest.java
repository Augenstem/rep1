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

public class CityDaoTest {

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
    public void addCity(){
        CityDao mapper = session.getMapper(CityDao.class);
        mapper.addCity(new CityEntity("mybatis城市添加",new ProvinceEntity(1,"xx")));
        session.commit();
    }

    @Test
    public void delCity(){
        CityDao  mapper = session.getMapper(CityDao.class);
        mapper.delCity(7);
        session.commit();
    }

    @Test
    public void updateCity(){
        CityDao mapper = session.getMapper(CityDao.class);
        mapper.updateCity(new CityEntity(6,"mybatis修改测试"));
        session.commit();
    }

    @Test
    public void allCity(){
        CityDao mapper = session.getMapper(CityDao.class);
        List<CityEntity> list = mapper.allCity();
        for (CityEntity item:list){
            System.out.println(item);
        }
    }


    @Test
    public void byidCity(){
        CityDao mapper = session.getMapper(CityDao.class);
        CityEntity city = mapper.byidCity(1);
        System.out.println(city);
    }


    @Test
    public void byNameCity(){
        CityDao mapper = session.getMapper(CityDao.class);
        int id = mapper.bynameAndPidCityDao(1,"呼和浩特市");
        System.out.println(id);
    }

}
