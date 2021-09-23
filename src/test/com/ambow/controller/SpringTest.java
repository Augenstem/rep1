package com.ambow.controller;

import com.ambow.service.CityService;
import com.ambow.service.ProvinceService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class -0---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------SpringTest {


    @Test
    public void SpringTest(){

//        CityEntity cityEntity = new CityEntity();
//        cityEntity.setCname("测试");


        //控制反转
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        CityEntity cityEntity = app.getBean(CityEntity.class);
//        CityEntity cityEntity1 = (CityEntity) app.getBean("cityEntity");   //依赖注入
        System.out.println(cityEntity);

    }


    @Test
    public void testAll() {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        ProvinceDao provinceDao = app.getBean(ProvinceDao.class);
        List<ProvinceEntity> list = provinceDao.allProvince();
        for (ProvinceEntity item:list){
            System.out.println(item);
        }

    }


    @Test
    public void testAdd(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        ProvinceService provinceService = (ProvinceService) app.getBean("provinceService");
        provinceService.addProvinceService("spring测试");
    }

    @Test
    public void testCityAll(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
//        CityDao cityDao = app.getBean(CityDao.class);
//        List<CityEntity> list = cityDao.allCity();
//        for(CityEntity item:list){
//            System.out.println(item);
//        }
        CityService cityService = (CityService) app.getBean("cityService");
        List<CityEntity> list = cityService.allCityService();
        for (CityEntity item:list){
            System.out.println(item);
        }
    }

    @Test
    public void testCityAdd(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        CityService cityService = (CityService) app.getBean("cityService");
        cityService.addCityService("spring添加测试",1);
    }
}
