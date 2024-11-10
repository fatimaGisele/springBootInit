package com.primer_proyecto.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value ="classpath:config.properties", encoding = "UTF-8")
})
public class Config {

}
