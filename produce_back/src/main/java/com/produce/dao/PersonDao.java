package com.produce.dao;

import com.produce.pojo.Person;

import java.util.List;
import java.util.Map;

public interface PersonDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByParam(Map<String,Object> param);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}