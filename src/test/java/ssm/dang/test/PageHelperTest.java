package ssm.dang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dang.ssm.pojo.Items;
import com.dang.ssm.service.ItemsService;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PageHelperTest {
	
	@Autowired
	private ItemsService itemsService;
	
	@Test
	public void test01() {
		PageInfo<Items> info = itemsService.findList(1, 1);
		System.out.println(info.getTotal());
		System.out.println(info.getPageNum());
		System.out.println(info.getPages());
		System.out.println(info.getPageSize());
		System.out.println(info.getList());
		System.out.println(info.isHasNextPage());
		System.out.println(info.isHasPreviousPage());
		
	}
	
	@Test
	public void test02() {
		
		Items items = itemsService.finById(1);
		System.out.println(items);
	
	}


}
