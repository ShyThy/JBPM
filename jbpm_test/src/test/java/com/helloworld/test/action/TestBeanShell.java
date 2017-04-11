package com.helloworld.test.action;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.context.exe.ContextInstance;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

/**
 * 测试BeanSHell
 * @author Administrator
 *
 */
public class TestBeanShell {

	public static void main(String[] args) {
		TestBeanShell.testTask();
	}
	
	private static void testTask(){
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		ProcessInstance processInstance = jbpmContext.newProcessInstance("simple");
		ContextInstance contextInstance = processInstance.getContextInstance();
		contextInstance.setVariable("param", "测试类写入的变量");;
		processInstance.signal();
		TaskInstance taskInstance = (TaskInstance) processInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
		taskInstance.end();
		System.out.println("通过script插入的流程变量newParam值为："+taskInstance.getVariable("newParam"));
		jbpmContext.close();
	}
}
