package com.znsd.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.znsd.mall.bean.DemoBean;
import com.znsd.mall.dao.IDemoDao;
import com.znsd.mall.service.IDemoService;

/**
* 作者：冯福
* 时间：2019年1月26日 下午5:56:23
* 描述：serviceImpl测试类
*/
@Service
public class DemoServiceImpl implements IDemoService{

	@Autowired
	private IDemoDao demoDao;
	
	@Override
	public void addTest(DemoBean demoBean) {
		demoDao.addTest(demoBean);
	}

	@Override
	public void queryTest(Integer userId) {
		demoDao.queryTest(userId);
	}

	@Override
	public void updateTest(DemoBean demoBean) {
		demoDao.updateTest(demoBean);
	}

	@Override
	public void deleteTest(Integer userId) {
		demoDao.deleteTest(userId);
	}

}
