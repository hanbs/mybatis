package com.example.demospringbootmybatis.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data // lombok getter/setter/tostring 지원
@Alias("city") // 이걸 지정하면 xml 파일의 ResultType을 지정 할 수 있다.
public class City {
    private Long id;
    private String name;
    private String country;
    private Long population;

    public City() {
    }

    public City(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}