package com.produce.test;

import com.produce.pojo.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by wuqing on 2016/6/16.
 */
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class AppTest extends  AbstractJUnit4SpringContextTests{

    @Autowired
    private Person person;

    @Test
    public void testApp(){
        System.out.println(person.getAge());
    }

}
