package com.test;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

/**
 * Node 节点中的 Action
 * @author Administrator
 *
 */
public class TestNodeActionHandler implements ActionHandler{

	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		System.out.println("采用 Action Handler 方式执行的结果！！！！");
	}

}
