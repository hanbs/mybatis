package com.example.demospringbootmybatis.service;

import com.example.demospringbootmybatis.dto.City;
import com.example.demospringbootmybatis.repository.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCityById(String name) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "+name);
        return cityMapper.selectCityById(name);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }


    public void addCity(City city) {
        cityMapper.insertCity(city);
    }

}
