package com.skcc.lazybook.hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Jpa 활용한 Dao
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
public interface HelloDao extends JpaRepository <Hello, Integer> {

}