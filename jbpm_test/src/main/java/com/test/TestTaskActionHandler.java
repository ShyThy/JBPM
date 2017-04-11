package com.test;

import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.taskmgmt.def.AssignmentHandler;
import org.jbpm.taskmgmt.exe.Assignable;

public class TestTaskActionHandler implements AssignmentHandler{

	@Override
	public void assign(Assignable assignable, ExecutionContext executionContext)
			throws Exception {
		System.out.println("task action hander : assignment !!!");
		assignable.setActorId("tttt");
	}

}
