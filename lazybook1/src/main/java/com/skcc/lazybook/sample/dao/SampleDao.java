package com.skcc.lazybook.sample.dao;

import java.util.List;

import com.skcc.lazybook.sample.model.Sample;
/**
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
public interface SampleDao {

    boolean create();
    boolean remove();
    Sample get();
    boolean update();
    List<Sample> findAll();

}
