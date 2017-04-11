package com.helloworld.test;

import org.jbpm.JbpmConfiguration;
/**
 * 创建jbpm 数据库
 * @author Administrator
 *
 */
public class TestCreateDBS {
	public static void main(String[] args) {
		JbpmConfiguration.getInstance().createSchema();
	}
}
