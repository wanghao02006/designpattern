package com.leiyu.designpattern.filterpattern.impl;

import com.leiyu.designpattern.filterpattern.Criteria;
import com.leiyu.designpattern.filterpattern.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        if(null == persons){
            return null;
        }
        List<Person> malepersons = new ArrayList<Person>();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if("MALE".equalsIgnoreCase(person.getGender())){
                malepersons.add(person);
            }
        }

        return malepersons;
    }
}
