import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes= {com.home.javaconfig.RootConfig.class,com.home.javaconfig.ServletConfig.class})
@WebAppConfiguration
public class TestJava {
	
	Logger logger = LoggerFactory.getLogger(TestJava.class);
	
	@Inject
	SqlSession sqlSession;
	
	@Test
	public void testQuery() throws Exception{
		logger.info(sqlSession.selectList("topMenuMapper.selectMenu").toString());
	}
	
	@Test
	public void testLogger() throws Exception {
		logger.info("테스트 확인");
	}
}
