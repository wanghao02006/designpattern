package com.leiyu.designpattern.filterpattern.impl;

import com.leiyu.designpattern.filterpattern.Criteria;
import com.leiyu.designpattern.filterpattern.Person;

import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        if(null == persons){
            return null;
        }
        return getCriteria().meetCriteria(getOtherCriteria().meetCriteria(persons));
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
