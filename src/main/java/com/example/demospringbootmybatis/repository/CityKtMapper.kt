//package com.example.demospringbootmybatis.repository
//
//import com.example.demospringbootmybatis.dto.City
//import org.apache.ibatis.annotations.Mapper
//import org.apache.ibatis.annotations.Param
//import org.apache.ibatis.annotations.Select
//
///* sql문을 실행 시키는 kotlin 언어 ibatis로 연동 하는 것 같다. */
//
//@Mapper
//interface CityKtMapper {
//    @Select("""
//          SELECT
//          *
//          FROM CITY
//          Where name=#{name}
//    """)
//    fun findAll(): List<City>
//
//    @Select("""
//        SELECT NAME FROM city WHERE name=#{name}
//    """)
//    fun findById(@Param("name") name: String): City
//}