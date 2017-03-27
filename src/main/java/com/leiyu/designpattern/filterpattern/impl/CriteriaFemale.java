package com.leiyu.designpattern.filterpattern.impl;

import com.leiyu.designpattern.filterpattern.Criteria;
import com.leiyu.designpattern.filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        if(null == persons){
            return null;
        }

        List<Person> femalePersons = new ArrayList<Person>();

        for(Person person : persons){
            if("FEMALE".equalsIgnoreCase(person.getGender())){
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
