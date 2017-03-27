package com.leiyu.designpattern.filterpattern;

import java.util.List;

/**
 * Created by wh on 2017/3/23.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
