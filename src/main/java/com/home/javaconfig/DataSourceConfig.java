package com.home.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {	
	
	/**
	 * 데이터 소스 설정
	 * @return
	 * @throws Exception
	 */
	@Bean
	public DriverManagerDataSource dataSource() throws Exception{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		dataSource.setUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521/XE");
		dataSource.setUsername("studydb");
		dataSource.setPassword("apmsetup");
		return dataSource;
	}
	
	/**
	 * 트랜잭션 매니저 등록
	 * @return
	 * @throws Exception 
	 */
	@Bean
	public DataSourceTransactionManager transactionManager() throws Exception {
		return new DataSourceTransactionManager(dataSource());
	}

}
