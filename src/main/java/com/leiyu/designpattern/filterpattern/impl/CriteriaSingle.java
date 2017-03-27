package com.leiyu.designpattern.filterpattern.impl;

import com.leiyu.designpattern.filterpattern.Criteria;
import com.leiyu.designpattern.filterpattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        if(null == persons){
            return null;
        }
        List<Person> singlePersons = new ArrayList<Person>();

        for(int i = 0 ; i < persons.size() ; i++){
            Person person = persons.get(i);
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
