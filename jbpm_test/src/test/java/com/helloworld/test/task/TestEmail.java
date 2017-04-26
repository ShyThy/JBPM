package com.helloworld.test.task;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class TestEmail {

	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		try {
			ProcessInstance processInstance = jbpmContext.newProcessInstance("HelloEmail");
			processInstance.signal();
			TaskInstance taskInstance = (TaskInstance) processInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
			taskInstance.start();
			taskInstance.end();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jbpmContext.close();
		}
	}
}
