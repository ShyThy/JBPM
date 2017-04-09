package com.helloworld.test;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

public class TestHelloWorldJBPM {

	public static void main(String[] args) {
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("HelloWorld/processdefinition.xml");
		ProcessInstance processInstance = new ProcessInstance(processDefinition);
		Token token = processInstance.getRootToken();
		
		System.out.println("1 当前流程所处流程名称："+ token.getNode().getName());
		token.signal();
		
		System.out.println("2 当前流程所处流程名称："+ token.getNode().getName());
		token.signal();
		
		System.out.println("3 当前流程所处流程名称："+ token.getNode().getName());
		token.signal();
		
		System.out.println("4 当前流程所处流程名称："+ token.getNode().getName());
		System.out.println("5 当前状态："+ token.getProcessInstance().hasEnded());
//		System.out.println("4 当前流程所处流程名称："+ token.getNode().getName());
//		token.signal();
		
		
	}
}
