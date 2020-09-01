package com.shentie.javademo2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shentie.javademo2.entity.CarEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: AutoMapper
 * @Author huamin
 * @Date: 2020/9/1 9:34
 * @Version 1.0
 */
@Mapper
public interface CarMapper extends BaseMapper<CarEntity> {

}