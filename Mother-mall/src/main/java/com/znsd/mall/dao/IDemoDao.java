package com.znsd.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.znsd.mall.bean.DemoBean;

/**
* 作者：冯福
* 时间：2019年1月26日 下午7:58:17
* 描述：mapper接口类
*/
public interface IDemoDao extends BaseMapper<DemoBean>{

	public void addTest(DemoBean demoBean);

	public List<DemoBean> queryTest(Integer userId);

	public void updateTest(DemoBean demoBean);

	public void deleteTest(Integer userId);

}
