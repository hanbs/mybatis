package com.example.demospringbootmybatis.repository;

import com.example.demospringbootmybatis.dto.City;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Mapper
public interface CityMapper {

    City selectCityById(String name);

    List<City> selectAllCity();

    void insertCity(City city);
}

