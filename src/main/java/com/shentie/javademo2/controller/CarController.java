package com.shentie.javademo2.controller;

import com.shentie.javademo2.entity.CarEntity;
import com.shentie.javademo2.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: controller
 * @Author huamin
 * @Date: 2020/8/29 16:51
 * @Version 1.0
 */
@RestController
@Api("测试接口")
public class CarController {
    @Autowired
    private CarService carService;


    @PostMapping("/findAll")
    @ApiOperation("findAll")
    public List<CarEntity> findAll(){

        List<CarEntity> rs = carService.findAll();
        return rs;
    }
    @PostMapping("/findCarById")
    @ApiOperation("findCarById")
    @ApiImplicitParam(name="id",value="查询id",dataType="int", paramType = "query")
    public List<CarEntity> findCarById(int id){

        List<CarEntity> rs= carService.findCarById(id);
        return rs;
    }

    @PostMapping("/addCar")
    @ApiOperation("addCar")
    public void addCar(){
        CarEntity car =new CarEntity();
        car.setBrand("brand");
        car.setPrice(12000D);
        car.setType("type");
        carService.addCar(car);
    }
}