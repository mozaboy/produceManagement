package com.produce.service.impl;

import com.produce.dao.PersonDao;
import com.produce.pojo.Person;
import com.produce.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/9.
 */
@Service("personService")
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getUserByParam(Map<String,Object> param) {
        return this.personDao.selectByParam(param);
    }


}
