package org.example.config;

import org.example.EnvPrint;
import org.example.TestEnvPrint;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources(
        value = {
                @PropertySource("classpath:application-test.properties")
        }
)
@Profile("test")
public class TestAppConfig {
        @Bean
        public EnvPrint envPrint() {
                return new TestEnvPrint();
        }
}

