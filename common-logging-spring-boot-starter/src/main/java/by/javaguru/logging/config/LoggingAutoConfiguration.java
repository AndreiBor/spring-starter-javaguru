package by.javaguru.logging.config;

import by.javaguru.logging.aop.FirstAspect;
import by.javaguru.logging.aop.SecondAspect;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Slf4j
@Configuration
@EnableConfigurationProperties(LoggingProperties.class)
@ConditionalOnClass(LoggingProperties.class)
@ConditionalOnProperty(prefix = "app.service.logging", name = "enabled", havingValue = "true")
public class LoggingAutoConfiguration {

    @PostConstruct
    public void init() {
        log.info("LoggingAutoConfiguration initialized");
    }

    @Bean
    @Order(1)
    public FirstAspect firstAspect() {
        return new FirstAspect();
    }

    @Bean
    @Order(2)
    public SecondAspect secondAspect() {
        return new SecondAspect();
    }
}
