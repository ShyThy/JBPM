package com.helloworld.test.task;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class TestTaskEvents {

	public static void main(String[] args) {
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		
		try {
			ProcessInstance processInstance = jbpmContext.newProcessInstance("HelloTaskEvents");
			processInstance.signal();
			TaskInstance taskInstance = (TaskInstance) processInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
//			taskInstance.start();
			taskInstance.end();
			System.out.println(processInstance.getRootToken().getNode().getName()+" node name ----------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			jbpmContext.close();
		}
//		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("HelloTaskEvents/processdefinition.xml");
//		ProcessInstance processInstance = new ProcessInstance(processDefinition);
		
	}
}
