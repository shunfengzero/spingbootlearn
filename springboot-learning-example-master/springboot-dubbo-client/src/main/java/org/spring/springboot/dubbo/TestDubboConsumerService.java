package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class TestDubboConsumerService{

   // @Reference(version = "1.0.0")//注解引入服务
  @Autowired//xml
    TestDubboService testDubboService;

    public void printCity() {
        String cityName="上海市";
        City city = testDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


}
