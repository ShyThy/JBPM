package com.helloworld.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;

/**
 * 导入流程模版
 * @author Administrator
 *
 */
public class TestDeploy {

	public static void main(String[] args) {
//		TestDeploy.deployByName("simple/processdefinition.xml");
//		TestDeploy.deployByName("HelloAction/processdefinition.xml");
		TestDeploy.deployByName("HelloTask/processdefinition.xml");
	}
	
	private static void deployByName(String name){
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource(name);
		jbpmContext.deployProcessDefinition(processDefinition);
		jbpmContext.close();
	}
	private static void deployHelloworld(){
		JbpmContext jbpmContext = JbpmConfiguration.getInstance().createJbpmContext();
		try {
			InputStream is = new FileInputStream(new File("D:/Space/helloworld.zip"));
			ZipInputStream zis = new ZipInputStream(is);
			ProcessDefinition processDefinition = ProcessDefinition.parseParZipInputStream(zis);
			jbpmContext.deployProcessDefinition(processDefinition);
			
			zis.close();
			is.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			jbpmContext.close();
		}
	}
}
