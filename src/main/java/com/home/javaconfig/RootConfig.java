package com.home.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@Import({DataBaseConfig.class,MyBatisConfig.class})
@ComponentScan(basePackages={"com.home.dao"},includeFilters=@ComponentScan.Filter(value= {Repository.class}),useDefaultFilters=false)
@ComponentScan(basePackages={"com.home.service"},includeFilters=@ComponentScan.Filter(value= {Service.class}),useDefaultFilters=false)
public class RootConfig {

}