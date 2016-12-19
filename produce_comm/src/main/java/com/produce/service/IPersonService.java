package com.produce.service;

import com.produce.pojo.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/9.
 */
public interface IPersonService {

    public List<Person> getUserByParam(Map<String,Object> param);
}
