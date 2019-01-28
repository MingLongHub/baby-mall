package com.znsd.mall.service;
/**
* 作者：冯福
* 时间：2019年1月28日 下午5:44:28
* 描述：
*/
public interface MailService {

	void sendSimpleMail(String to, String subject, String content);

}
