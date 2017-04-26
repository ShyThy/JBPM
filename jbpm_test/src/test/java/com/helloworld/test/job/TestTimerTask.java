package com.helloworld.test.job;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

public class TestTimerTask {

	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		ProcessInstance processInstance = jbpmContext.newProcessInstance("HelloTimerTask");
		Token token = processInstance.getRootToken();
		token.signal();
		System.out.println("当前流程节点：：：：：："+token.getNode().getName());
		jbpmContext.close();
	}
}
