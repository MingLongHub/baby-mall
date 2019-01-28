package com.znsd.mall.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.znsd.mall.bean.DemoBean;
import com.znsd.mall.service.IDemoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
* 作者：冯福
* 时间：2019年1月26日 下午5:55:37
* 描述：controller测试类
*/
@RestController
@Api(tags = "DemoAction", description = "测试接口")
@RequestMapping("/demo")
public class DemoAction {
	
	@Autowired
	private IDemoService demoService;
	
	@ApiOperation(value = "增加测试", notes = "增加测试注释")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "userName", paramType = "body", dataType = "String", value = "用户名", required = true),
		@ApiImplicitParam(name = "password", paramType = "body", dataType = "String", value = "密码", required = true) })
	@ApiResponses({ @ApiResponse(code = 200, message = "请求成功了哦！"), @ApiResponse(code = 404, message = "页面去哪了？") })
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Object addTest(DemoBean demoBean) {
		try {
			demoService.addTest(demoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ApiOperation(value = "查询测试", notes = "查询测试注解")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "userId", paramType = "path", dataType = "Integer", value = "用户ID", required = true)
	})
	@ApiResponses({ @ApiResponse(code = 200, message = "请求成功了哦"), @ApiResponse(code = 404, message = "页面去哪了？") })
	@RequestMapping(value = "/test/{userId}", method = RequestMethod.GET)
	public Object queryTest(@PathVariable("userId") Integer userId) {
		try {
			demoService.queryTest(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ApiOperation(value = "修改测试", notes = "修改测试注解")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "userId", paramType = "path", dataType = "Integer", value = "用户ID", required = true),
		@ApiImplicitParam(name = "userName", paramType = "body", dataType = "String", value = "用户名", required = true),
		@ApiImplicitParam(name = "password", paramType = "body", dataType = "String", value = "密码", required = true)
	})
	@ApiResponses({ @ApiResponse(code = 200, message = "成功"), @ApiResponse(code = 404, message = "页面去哪了?")})
	@RequestMapping(value = "/test/", method = RequestMethod.PUT)
	public Object updateTest(@PathVariable("userId") Integer userId, DemoBean demoBean) {
		
		try {
			demoBean.setUserId(userId);
			demoService.updateTest(demoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ApiOperation(value = "删除测试", notes = "修改测试注解")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "userId", paramType = "path", dataType = "Integer", value = "用户ID", required = true)
	})
	@ApiResponses({@ApiResponse(code = 200, message = "成功"), @ApiResponse(code = 404, message = "页面不见了")})
	@RequestMapping(value = "/test/{userId}", method = RequestMethod.DELETE)
	public Object deleteTest(@PathVariable("userId") Integer userId) {
		try {
			demoService.deleteTest(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
