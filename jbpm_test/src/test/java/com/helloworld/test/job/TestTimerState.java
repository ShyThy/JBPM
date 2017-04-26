package com.helloworld.test.job;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;

public class TestTimerState {

	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		ProcessInstance processInstance = jbpmContext.newProcessInstance("HelloTimerState");
		processInstance.signal();
		jbpmContext.close();
	}
}
