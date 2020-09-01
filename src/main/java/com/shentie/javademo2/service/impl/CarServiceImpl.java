package com.shentie.javademo2.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shentie.javademo2.dao.CarMapper;
import com.shentie.javademo2.entity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title: AutoServiceImpl
 * @Author huamin
 * @Date: 2020/9/1 9:38
 * @Version 1.0
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, CarEntity> implements CarService {
    @Autowired(required = false)
    private CarMapper carMapper;

    //查询所有
    @Override
    public List<CarEntity> findAll() {
        List<CarEntity> rs=carMapper.selectList(null);
        return rs;
    }

    @Override
    public void addCar(CarEntity car)
    {
        carMapper.insert(car);
    }

    //根据id查询
    @Override
    public List<CarEntity> findCarById(Integer id) {
        QueryWrapper<CarEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        List<CarEntity> rs=carMapper.selectList(queryWrapper);
        return rs;
    }
}