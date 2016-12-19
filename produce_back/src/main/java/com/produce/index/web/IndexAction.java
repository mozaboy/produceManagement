package com.produce.index.web;

import com.produce.pojo.Person;
import com.produce.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/16.
 */
@Controller
public class IndexAction {

    @Autowired
    private Person person;

    @Resource
    private IPersonService personService;

    @RequestMapping(value="index.do")
    public Object index(Model model){
        model.addAttribute("str","hello");

        Map<String,Object> param = new HashMap<String,Object>();
        List<Person> personList = personService.getUserByParam(param);

        model.addAttribute("persons",personList);
        return "showPerson";
    }


    @RequestMapping(value="test.do")
    @ResponseBody
    public Object test(String name){

        Map resultMap = new HashMap<String,Object>();
        resultMap.put("name","Jay");

        return resultMap;
    }

}
