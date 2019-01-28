package com.znsd.mall.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;

/**
* 作者：冯福
* 时间：2019年1月26日 下午8:00:57
* 描述：测试实体类
*/
@Data
@TableName("ums_admin")
public class DemoBean implements Serializable{
	
	@TableId("id")
	private Integer userId;//用户Id
	
	@TableField("username")
	private String userName;//用户名
	
	@TableField("password")
	private String password;//密码
	
}
