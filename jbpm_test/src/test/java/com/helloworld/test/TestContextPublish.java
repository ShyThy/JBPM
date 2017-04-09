package com.helloworld.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.ZipInputStream;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;

/**
 * 测试发布流程
 * @author Administrator
 *
 */
public class TestContextPublish {
	public static void main(String[] args) {
		//创建jbpm 上下文
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext(JbpmContext.DEFAULT_JBPM_CONTEXT_NAME);
		try {
			//使用文件输入流加入流程模版
			FileInputStream fileInputStream = new FileInputStream("D:/Space/helloworld.zip");
			//使用 zip 输入流加入流程模版
			ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
			//创建流程模版
			ProcessDefinition processDefinition = ProcessDefinition.parseParZipInputStream(zipInputStream);
			//发布流程模版
			jbpmContext.deployProcessDefinition(processDefinition);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			jbpmContext.close();
		}
	}
}
