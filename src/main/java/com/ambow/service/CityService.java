package com.ambow.service;

import java.util.List;

public class CityService {

    CityDao cityDao;

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }
    //添加
//    public void addCityService(String cname, String province) {
//
//        ProvinceEntity provinceEntity = new ProvinceEntity(Integer.parseInt(province),"xx");
//        CityEntity cityEntity = new CityEntity(cname,provinceEntity);
//        cityDao.addCityDao(cityEntity);
//    }


    public void addCityService(String name,int cproid){
        ProvinceEntity provinceEntity = new ProvinceEntity();
        provinceEntity.setPid(cproid);
        CityEntity cityEntity = new CityEntity();
        cityEntity.setCname(name);
        cityEntity.setCproid(provinceEntity);
        cityDao.addCity(cityEntity);
    }



    //根据id查
//    public CityEntity byidService(String id){
//        CityEntity cityEntity = cityDao.byidCityDao(Integer.parseInt(id));
//        return cityEntity;
//    }

    //删除
    public void delCityService(int id){
        cityDao.delCity(id);
    }

    //修改
    public void updateCityService(int id,String name){
        cityDao.updateCity(new CityEntity(id,name));
    }

    //查询所有
    public  List<CityEntity> allCityService(){
        return cityDao.allCity();
    }


    public int byCnameAndProidCityService(String name,int cproid){
        return cityDao.bynameAndPidCityDao(cproid,name);
    }

//    public List<CityEntity> selectAllByCproidService(String cproid){
//        return cityDao.selectAllCityByProidDao(Integer.parseInt(cproid));
//    }
//
//    public List<CityEntity> selectAllCityService1(){
//        return cityDao.selectAllCityDao1();
//    }
//
//    public List<CityEntity> selectAllService(){
//        return cityDao.selectAllCityDao();
//    }
}
