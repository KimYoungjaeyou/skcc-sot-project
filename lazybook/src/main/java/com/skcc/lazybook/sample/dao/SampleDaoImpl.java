package com.skcc.lazybook.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skcc.lazybook.sample.model.Sample;
/**
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
@Repository
public class SampleDaoImpl implements SampleDao {

    @Autowired
    private Sample vo;

    @Override
    public boolean create() {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public Sample get() {
        return null;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public List<Sample> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
