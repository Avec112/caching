package io.avec.caching.ehcache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorService {

    @Cacheable("areaOfCircleCache")
    public double areaOfCircle(int radius) {
        log.info("Calculating area of a circle with a radius of {}", radius);
        return Math.PI * Math.pow(radius, 2);
    }
}
