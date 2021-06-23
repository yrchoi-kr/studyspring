

#### 20210624 (목) 작업
- 추가할 기능: AOP
- tiles 설치
- tiles 오류 확인 필요.
- tiles-define.xml의 연구 필요.
- tiles를 사용하여 controller와 jsp파일의 수정 필요.

#### 20210624 (수) 작업
- 추가할 기능: Tiles, AOP
- DB에서 Controller까지 데이터 이동 확인.
- jsp에서 jstl의 forEach를 사용하여 메뉴 출력 확인.

#### 20210622 (화) 작업
- 추가할 기능: Tiles, AOP
- 페이지 구성도 제작
- 구성도 제작
- 홈쇼핑 홈페이지 제작을 위한 테이블 레이아웃 제작

#### 20210621 (월) 작업
- 모듈의 설정을 추가할 때는, id는 매서드의 이름, class는 리턴 값으로, 설정은 set매서드를 이용하여 설정할 수 있다.
- java환경 config에서는 클래스에 @ComponentScan(basePackages={"com.home.controller"},includeFilters=@ComponentScan.Filter(value= {Controller.class}),useDefaultFilters=false)를 추가하는 방식으로 컴포넌트를 추가할 수 있다.
- sqlSession 유닛 테스트 확인
- mybatis 설치
- JUnit 설치

#### 20210620 (일) 작업
- 새로운 config는 Servlet이나 root Config에서 @Import를 통하여 추가한다.
- log4jdbc.log4j2.properties는 꼭 필요하다.
- 오라클은 dataSource 설정시 DriverManagerDataSource를 리턴.
- mysql은 dataSource 설정시 BasicDataSource를 리턴
- mybatis 연동: pom.xml에 추가 -> log4jdbc.log4j2.properties 추가 -> DataSource, SqlSession Config.java 추가
- JUnit: pom.xml 추가. 예제파일에 @RunWith, @ContextConfiguration, @WebAppConfiguratio 추가.

#### 20210609 (수) 작업

SPRING

JAVA Config

```
web.xml->WebInitializer.java
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Root WebApplicationContext
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	// Servlet WebApplicationContext
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletConfig.class };
	}
	
    // DispatcherServlet Mapping
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// filter
	@Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[] { characterEncodingFilter };
    }
}
```
```
servlet-context -> ServletConfig
 package com.home.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.home.controller")
public class ServletConfiguration implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
```
```
root-context -> RootConfig
 package com.home.javaconfig;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfiguration {

}
```
