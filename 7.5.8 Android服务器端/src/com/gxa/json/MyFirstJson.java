package com.gxa.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Java��Json���ݽ�����ʹ��Json��Ҫ�������¼�����
 * 1��json-lib-2.3-jdk15.jar
 * 2��commons-beanutils-1.7.0.jar
 * 3��commons-collections-3.2.jar
 * 4��commons-lang-2.0.jar
 * 5��ezmorph-1.0.4.jar
 * 6. commons-logging.jar
 * @author Administrator
 *
 */
public class MyFirstJson {

	/**
	 * Listת����Json����
	 *
	 */
	@Test
	public void javaJsonForList() {
		List<String> list = new ArrayList<String>();
		list.add("�ɶ�");
		list.add("����");
		list.add("����");
		//�����List�������use JSONArray instend
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
	}
	
	/**
	 * Mapת����Json����
	 *
	 */
	@Test
	public void javaJsonForMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�Ĵ�", "����");
		map.put("ɽ��", "����");
		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);
	}
	
	/**
	 * JavaBeanת����Json����
	 *
	 */
	@Test
	public void javaJsonForBean() {
		StuBean stu = new StuBean();
		stu.setId("s001");
		stu.setName("Jahson");
		stu.setPassword("123456");
		JSONObject jsonObject = JSONObject.fromObject(stu);
		System.out.println(jsonObject);
	}
	
	/**
	 * ��һ��JavaBeanת����Json����
	 *
	 */
	@Test
	public void javaJsonForBeans() {
		StuBean stu = new StuBean();
		stu.setId("s001");
		stu.setName("Jahson");
		stu.setPassword("123456");
		StuBean stu2 = new StuBean();
		stu2.setId("s002");
		stu2.setName("Jack");
		stu2.setPassword("654321");
		List<StuBean> list = new ArrayList<>();
		list.add(stu);
		list.add(stu2);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
	}
	
	/**
	 * Arrayת����Json����
	 *
	 */
	@Test
	public void javaJsonForArray() {
		boolean[] bool = new boolean[]{false,true,false};
		JSONArray jsonArray = JSONArray.fromObject(bool);
		System.out.println(jsonArray);
	}
	
}