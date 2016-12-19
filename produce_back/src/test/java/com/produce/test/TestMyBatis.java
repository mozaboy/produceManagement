package com.produce.test;

import com.alibaba.fastjson.JSON;
import com.produce.pojo.Person;
import com.produce.service.IPersonService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2016/7/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext-back-beans.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    private ApplicationContext ac = null;
    @Resource
    private IPersonService personService = null;

    @Test
    public void test1() {
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("id" , 100000);
        List<Person> personList = personService.getUserByParam(param);
        logger.info(JSON.toJSONString(personList.get(0)));
    }

}
