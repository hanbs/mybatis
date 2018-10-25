package com.example.demospringbootmybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data // lombok getter/setter/tostring 지원
@AllArgsConstructor
@NoArgsConstructor
@Alias("city")
public class City {
    private Long id;
    private String name;
    private String country;
    private Long population;
}

// 이걸 지정하면 xml 파일의 ResultType을 지정 할 수 있다.