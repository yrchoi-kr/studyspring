package com.home.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@Import({DataSourceConfig.class,SqlMapperConfig.class})
@ComponentScan(basePackages={"com.home.dao.impl"},includeFilters=@ComponentScan.Filter(value= {Repository.class}),useDefaultFilters=false)
@ComponentScan(basePackages={"com.home.service.impl"},includeFilters=@ComponentScan.Filter(value= {Service.class}),useDefaultFilters=false)
public class RootConfig {


}