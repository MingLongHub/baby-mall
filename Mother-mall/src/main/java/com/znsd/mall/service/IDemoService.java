package com.znsd.mall.service;

import com.znsd.mall.bean.DemoBean;

/**
* 作者：冯福
* 时间：2019年1月26日 下午5:55:37
* 描述：service接口测试类
*/
public interface IDemoService {

	public void addTest(DemoBean demoBean);

	public void queryTest(Integer userId);

	public void updateTest(DemoBean demoBean);

	public void deleteTest(Integer userId);

}
