package ssm.dang.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dang.ssm.mapper.UserMapper;
import com.dang.ssm.pojo.User;
import com.dang.ssm.pojo.UserExample;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ControllerTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test01() {
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example );
		System.out.println(list);
	}
	
	
	

}
