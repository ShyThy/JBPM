package com.helloworld.test.action;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

/**
 * 测试 Task node
 * @author Administrator
 *
 */
public class TestTaskAction {
	
	public static void main(String[] args) {
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("HelloTask/processdefinition.xml");
		ProcessInstance processInstance = new ProcessInstance(processDefinition);
		Token token = processInstance.getRootToken();
		System.out.println("Test task action 111 node name : "+token.getNode().getName());
		token.signal();
		System.out.println("Test task action 222 node name : "+token.getNode().getName());
		token.signal();
		System.out.println("Test task action 333 node name : "+token.getNode().getName());
	}
}
