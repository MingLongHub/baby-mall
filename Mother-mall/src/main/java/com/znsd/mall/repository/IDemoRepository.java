package com.znsd.mall.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.znsd.mall.bean.DemoBean;

/**
* 作者：冯福
* 时间：2019年1月28日 下午8:16:23
* 描述：
*/
public interface IDemoRepository extends MongoRepository<DemoBean, String>{

}
