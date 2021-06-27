#### 해야할 일
- admin부분 먼저 구현해보자.
- 1. 게시판 관리.(문의사항, 자유게시판)
-  페이징, 검색, CRUD 등.
- 2. 메뉴 관리(product 관리하기 위한 구분, 메뉴와 product, content부분은 연관된 부분이 있다.)
- AOP설치 및 모든 HomeController부분 /home이 포함되는 부분에 top_menu를 보낸다.(menu부분도 댓글처럼 트리형식으로 만드는 것이 낫지 않을까? 실제로 갯수도 많지 않을텐데..)
- index를 제외한 곳에 middle_menu를 보낸다.
- middle_menu중 하나를 클릭하여 left사이드에 출력해야 하는 bottom_menu내용을 보내준다.

- 웹소켓이라는 기능이 있다. 서버와 클라이언트의 양방향 통신이 가능하다.(웹사이트에 실시간 채팅 기능의 구현을 가능하게 한다.) 둘의 동시구현도 괜찮은가?

- admin페이지 제작. 
- 메뉴관리, 게시판관리, 상품관리, 유저관리
- 공부할 내용(오라클의 CRUD 외의 함수.)
- 댓글 만들 때 트리형식으로 무한 대댓글이 가능하게 만들어보자.
- 오라클에 저장할때 트리형식으로 테이블작성.

- index는 예외로서 처리하여 둔다.
- 나머지는 admin과 home로 묶어서 처리.

#### Tiles와 AOP 구성
- 방법1: root 값을 string으로 저장하고 , 구분자를 설정해준 뒤, split으로 나눠 준 후, int로 변환하여 연산한 뒤 다시 저장할때는 string으로 변환하여 저장 방식?
- 방법2: 절대 될 수 없는 수를 정해서 그 이상이면 서브 메뉴 방식. 단순히 빼거나 나머지 값을 구하는 것으로 연산이 가능해진다.
- 방법3: parent를 pk로 지정하면 전부 해결된다. ---! 이 방법 사용
- 트리구조 데이터베이스에 구현하는 법: self join
- 밑으로 가지가 없는 애들 terminal
- page-define layout부분: index페이지(1), admin, home 페이지(2)
- 내부 속성을 호출 이름에 따라 변경이 가능하기 때문에 실제로는 레이아웃만 같고 다른 페이지로 만들 수 있다.
- Controller에서 Request를 받아서 tiles로 호출하는 형식.
- AOP를 이용하여 페이지에 변수를 전달하는데, home부분에는 TopMenu데이터를 항상 출력.
- 변수 하나를 이용하여 처리 하는 것: 설명부분이 많을때
- 호출 자체를 다른 형식으로 하는 것: 설명부분이 적을때
- 구분이 맞는가?
- AOP는 home을 Request할 때, Top_Menu를 항상 전달해준다. 
- 메뉴관리에는 모든 Menu데이터를 출력.
- 게시판관리에는 모든 게시판 데이터.
- 로그인 부분도 만들거면 그 부분도 Tiles로 관리할 필요가 있다.session으로 로그인 여부 등을 받게 된다면 그 값에 따라서 다른 부분을 가져오는 것이 가능한가?
- jsp->Controller->tiles->jsp->Controller
- Controller에서는 @RequestMapping 함수를 하나 만들어서 로그인 여부, 권한 여부를 판단할 필요가 있다.
- 큰 틀은 jsp Tiles Controller인데 Tiles는 layout과 파츠(header,footer)로 나눠지고 define에서 구성을 조합하는 역할을 한다.
- 레이아웃과 파츠는 이름 등에 따라서 유동적으로 바꿀 수 있는데 어떻게 구성해야 효율적인지는 생각할 필요가 있다.
- 현재 레이아웃은 noLeft와 onLeft로 나눠져 있다.
- 파츠는 admin, home으로 나눠져 있으며, 로그인 부분의 추가가 필요하다.
- 공용부분, admin 부분, home 부분으로 나누는 것이 관리하기 편할까?
- 브라우저에서 회원일 경우, 관리자일 경우, 비회원일 경우, 상관 없는 경우로 나눠진다.
- 레이아웃은 틀이 같은 것끼리 묶을 수 있다.
- *, {1}을 통하여 레이아웃에 다른 파츠를 붙이는 것이 가능하다.
- 파츠는 호출이름에따라 구분가능한데, 파츠를 나누기 위한 구분을 무엇으로 하는 것이 좋을지 의문.
- common, admin, home?
- 페이지 종류: index.jsp, admin.jsp, adminmenuCRUD.jsp, adminproductCRUD.jsp, adminmemberCRUD.jsp
- userproduct.jsp(메뉴 구분),결제페이지.jsp, mypage.jsp
- AdminController, HomeController, CommonController
- 컨트롤러에서 check후 return값 결정. 
- 이 경우에는 index는 common으로, (각 페이지의 세부 구성이 우선시 되어야 하겠다. 안 그러면 중반부쯤에 전부 꼬일 듯.)

#### 20210627(일) 작업
- @ControllerAdvice는 @ExceptionHandler와 함께 예외 처리 설정하는 클래스에 쓰인다? 메소드이름이 에러명이어야 하는 듯 하다.(확인 필요)
- AOP는 pom.xml에 의존성추가, root-config에서 aop패키지 추가, servlet에 프록시 설정을 추가하는 것으로 설치및 설정가능.
- @EnableAspectJAutoProxy(proxyTargetClass = true)
- 프록시 개념에 대한 이해 필요.
- myBatis의 mapper도 자바로 설정이 가능하다. 이 부분의 설정을 추가하는 것이 @Mapper, @MapperScan인 것 같다. 경로또한 java class 경로 형식으로 바꿔줘야 한다.(실험 완료.)
- mapper 기능은 @로도 가능하고, xml을 불러오는 형태도 가능하다. 하지만 java설정형식이면 @형태가 직관성 있을 것 같다.
- 참고 https://arcsit.tistory.com/entry/Spring-40-Mybatis-java-config%EB%A1%9C-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0
- 

#### 20210626(토) 작업
- RestAPI(=Restfull API): 기존의 쿼리스트링 ?key=value방식에서 보안성이 떨어지는 점을 보안하기 위해 value1/value2/value3 의 형태로 전송하는 것.
- Ajax는 부분 변환. 로그인에서 로그인 부분만 변환하는 방식을 말함.
- success: 와 error: 로 나눠져서 처리. datatype이 text, html, json이 있기 때문에 json을 이용해서 자료를 보낼 수 있다?

#### 20210625 (금) 작업
- tiles 설정 완료.
- 에러 확인 완료.
- tiles-define.xml 사용 가능.(미완)
- jsp 나누기, controller와의 연관 관계 확인 완료.

- tiles
- layout	:파츠를 모으는 부분. insert를 사용하여 배치 각 큰 태그도 tiles에 포함 시키면 편함.
- header	:각종 import 부분. js, css, script부분이 위치.
- nav		:상단 메뉴 부분
- sidebar	:좌측 메뉴 부분
- content	:본문 내용
- footer	:하단 부분.

-tiles-define.xml
<!-- extends를 사용하여 위의 설정을 상속받을 수 있다.-->
    <definition name="home.index.tiles" extends="noMenu.tiles"><!-- 여기의 name는 Controller에서 return하는 값을 나타낸다. -->
    	<put-attribute name="content" value="" /><!-- 여기서의 {숫자}는 위에서 *을 나타낸다. -->
    </definition>
    <!-- 폴더의 이름과 설정을 하기에 따라서 간결한 코딩이 가능해진다. 예를 들어 폴더와 jsp의 이름을 tiles의 구조에 맞춰서 나눈다면 몇몇 상속을 제외하고는 *을 통하여 설정 및 세팅이 가능하다. --> 




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
