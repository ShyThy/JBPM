package com.helloworld.test.action;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

/**
 * Node 节点action 测试
 * @author Administrator
 *
 */
public class TestActionHandler {
	
	public static void main(String[] args) {
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("HelloAction/processdefinition.xml");
		ProcessInstance processInstance = new ProcessInstance(processDefinition);
		Token token = processInstance.getRootToken();
		System.out.println("1 当前流程所处节点名称："+token.getNode().getName());
		token.signal();
		System.out.println("2 当前流程所处节点名称："+token.getNode().getName());
		token.signal();
		System.out.println("3 当前流程所处节点名称："+token.getNode().getName());
		token.signal();
		System.out.println("4 当前流程所处节点名称："+token.getNode().getName());
		token.signal();
		System.out.println("5 当前流程所处节点名称："+token.getNode().getName());
		token.signal();
	}
}
