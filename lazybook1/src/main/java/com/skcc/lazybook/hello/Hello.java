package com.skcc.lazybook.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Spring Data(JPA) 활용한 Domain
 * 참고사이트:http://millky.com/@origoni/post/1101
 * 
 * @author Koo MinJeong
 * @since 1.0
 * 
 */

@Entity
public class Hello {
    @Id
    @GeneratedValue
    int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}