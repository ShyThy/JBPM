package com.helloworld.test.task;

import org.jbpm.JbpmConfiguration;

public class TestRunJob {

	public static void main(String[] args) {
		JbpmConfiguration.getInstance().getJobExecutor().start();
	}
}
