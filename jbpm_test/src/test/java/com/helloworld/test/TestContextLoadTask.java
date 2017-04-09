package com.helloworld.test;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.taskmgmt.exe.TaskInstance;

/**
 * 加载任务实例
 * @author Administrator
 *
 */
public class TestContextLoadTask {

	public static void main(String[] args) {
		//创建 jbpm 上下文
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext(JbpmContext.DEFAULT_JBPM_CONTEXT_NAME);
		long id = 1L;
		TaskInstance taskInstance = jbpmContext.loadTaskInstance(id);
		jbpmContext.close();
	}
}
