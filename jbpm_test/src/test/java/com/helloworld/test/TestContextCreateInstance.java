package com.helloworld.test;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;

/**
 * 创建流程实例
 * @author Administrator
 *
 */
public class TestContextCreateInstance {

	public static void main(String[] args) {
//		创建jbpm 上下文
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext(JbpmContext.DEFAULT_JBPM_CONTEXT_NAME);
		ProcessInstance processInstance = jbpmContext.newProcessInstance("HelloWorld");
		jbpmContext.close();
		
	}
}
