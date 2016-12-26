package com.produce.dao;

import com.produce.mybatis.MyBatisDao;
import com.produce.pojo.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PersonDao extends MyBatisDao {

    public PersonDao(){
        super("PERSON");
    }

    public List<Person> selectByParam(Map<String,Object> param){
        return super.queryForList("selectByParam",param);
    }

}