package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;

public interface TestDubboService {

    City findCityByName(String cityName);
}
