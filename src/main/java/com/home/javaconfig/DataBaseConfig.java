package com.home.javaconfig;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 데이터베이스 설정
 * @author 김영제
 *
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfig {
	/**
	 * 데이터소스 등록
	 */
	
	@Bean(destroyMethod="close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		dataSource.setUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521/studydb");
		dataSource.setUsername("studydb");
		dataSource.setPassword("apmsetup");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}

	/**
	 * 트랜잭션 매니저 등록
	 */
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
