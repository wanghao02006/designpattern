package com.leiyu.designpattern.filterpattern.impl;

import com.leiyu.designpattern.filterpattern.Criteria;
import com.leiyu.designpattern.filterpattern.Person;

import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        if(null == persons){
            return null;
        }
        List<Person> cpersons = this.getCriteria().meetCriteria(persons);
        List<Person> opersons = this.getCriteria().meetCriteria(persons);

        for(Person person : opersons){
            if(!cpersons.contains(person)){
                cpersons.add(person);
            }
        }

        return cpersons;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public Criteria getOtherCriteria() {
        return otherCriteria;
    }

    public void setOtherCriteria(Criteria otherCriteria) {
        this.otherCriteria = otherCriteria;
    }
}
