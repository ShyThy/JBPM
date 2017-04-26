package com.helloworld.test.job;

import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class TestTimerTaskEnd {

	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		List list = jbpmContext.getTaskList();
		for (Object object : list) {
			System.out.println(object.toString());
		}
		TaskInstance taskInstance = (TaskInstance) jbpmContext.getTaskList("gaogao").get(0);
		taskInstance.end();
		jbpmContext.close();
	}
}
