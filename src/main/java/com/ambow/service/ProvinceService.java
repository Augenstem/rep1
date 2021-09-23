package com.ambow.service;

import java.util.List;

public class ProvinceService {

    ProvinceDao provinceDao;

    public void setProvinceDao(ProvinceDao provinceDao) {
        this.provinceDao = provinceDao;
    }

    //添加
    public void addProvinceService(String name){
        provinceDao.addProvince(name);
    }

    //查询
    public List<ProvinceEntity> allProvinceServince(){
        return provinceDao.allProvince();
    }

    //删除
    public void delProvinceServince(int id){
        provinceDao.delProvince(id);
    }

    //根据id查
//    public ProvinceEntity byidServince(String id){
//        ProvinceEntity provinceEntity = provinceDao.byidProvinceDao(Integer.parseInt(id));
//        return provinceEntity;
//    }

    //修改
    public void updateServince(int id,String name){
        provinceDao.updateProvince(new ProvinceEntity(id,name));

    }



//    public ProvinceEntity bynameProvinceService(String name) {
//           return provinceDao.bynameProvinceDao(name);
//    }
}
