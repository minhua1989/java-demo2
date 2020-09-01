package com.shentie.javademo2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shentie.javademo2.entity.CarEntity;

import java.util.List;

/**
 * @title: AutoService
 * @Author huamin
 * @Date: 2020/9/1 9:38
 * @Version 1.0
 */
public interface CarService extends IService<CarEntity> {

    public List<CarEntity> findAll();

    public void addCar(CarEntity car);

    public List<CarEntity> findCarById(Integer id);


}