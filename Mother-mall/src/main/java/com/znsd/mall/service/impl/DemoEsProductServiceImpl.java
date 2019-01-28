package com.znsd.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.znsd.mall.service.IDemoEsProductService;

/**
* 作者：冯福
* 时间：2019年1月28日 下午8:27:35
* 描述：
*/
public class DemoEsProductServiceImpl implements IDemoEsProductService {
	
	@Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
	
}
