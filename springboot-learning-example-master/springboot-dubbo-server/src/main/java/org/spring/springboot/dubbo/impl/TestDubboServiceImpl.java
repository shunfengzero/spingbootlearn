package org.spring.springboot.dubbo.impl;

//import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.TestDubboService;
import org.springframework.stereotype.Service;


//注解的方式
/*@Service(version = "1.0.0")
public class TestDubboServiceImpl implements TestDubboService {

    public City findCityByName(String cityName) {

        return new City(2L, 311L, "上海市", "描述");
    }*/
//xml的方式
@Service("testDubboService")
public class TestDubboServiceImpl implements TestDubboService {

    public City findCityByName(String cityName) {

        return new City(2L, 311L, "上海市", "描述");
    }
}
