package com.helloworld.test;

import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;

/**
 * 获取代办任务
 * @author Administrator
 *
 */
public class TestContextGetTasks {
	
	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext(JbpmContext.DEFAULT_JBPM_CONTEXT_NAME);
		// actorId 为任务参与者名称
		List list = jbpmContext.getTaskList("actorId");
		jbpmContext.close();
	}
}
