package com.znsd.mall.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.znsd.mall.action.DemoAction;
import com.znsd.mall.bean.DemoBean;
import com.znsd.mall.dao.IDemoDao;
import com.znsd.mall.service.RedisService;

/**
* 作者：冯福
* 时间：2019年1月27日 下午10:22:45
* 描述：
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

	@Autowired
	private IDemoDao demoDao;
	
	@Autowired
	private DemoAction demoAction;
	
	private RedisService redisService;
	
	@Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<DemoBean> userList = demoDao.selectList(null);
        Assert.assertEquals(2, userList.size());
        userList.forEach(System.out::println);
    }
	
	@Test
	public void testAdd() {
		DemoBean demoBean = new DemoBean();
		demoBean.setUserName("zhangsan2");
		demoBean.setPassword("12345622");
		demoAction.addTest(demoBean);
		redisService.set("test", "zhangsan");
	}
	
	@Test
	public void testQuery() {
		demoAction.queryTest(4);
	}
	
	@Test
	public void testUpdate() {
		DemoBean demoBean = new DemoBean();
		demoBean.setUserName("lisi");
		demoBean.setPassword("123456789");
		demoAction.updateTest(4, demoBean);
	}
	
	public void testDelete() {
		demoAction.deleteTest(4);
	}
}
