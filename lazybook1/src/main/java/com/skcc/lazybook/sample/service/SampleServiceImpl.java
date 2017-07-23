package com.skcc.lazybook.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.lazybook.sample.dao.SampleDao;
import com.skcc.lazybook.sample.model.Sample;

@Service
public class SampleServiceImpl implements SampleService {
/**
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
    @Autowired
    SampleDao dao;

    public String doSomethingWithSample() {
        String str = "나는 서비스이지만, 아무것도 하지 않는다. -> +" + dao.get();
        return str;
    }
}
