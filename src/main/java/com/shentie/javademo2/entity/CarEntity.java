package com.shentie.javademo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @title: Car
 * @Author huamin
 * @Date: 2020/9/1 9:26
 * @Version 1.0
 */

    @TableName("car")//和数据库的表相对应
    @Data//自动添加get/set方法
    public class CarEntity {
        //主键自增
        @TableId(type = IdType.AUTO)
        private Integer id;
        private String type;
        private String brand;
        private Double price;
    }