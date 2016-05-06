package com.gxa.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Java与Json数据交互，使用Json需要加入如下几个包
 * 1、json-lib-2.3-jdk15.jar
 * 2、commons-beanutils-1.7.0.jar
 * 3、commons-collections-3.2.jar
 * 4、commons-lang-2.0.jar
 * 5、ezmorph-1.0.4.jar
 * 6. commons-logging.jar
 * @author Administrator
 *
 */
public class MyFirstJson {

	/**
	 * List转换成Json数据
	 *
	 */
	@Test
	public void javaJsonForList() {
		List<String> list = new ArrayList<String>();
		list.add("成都");
		list.add("绵阳");
		list.add("西昌");
		//如果是List，则必须use JSONArray instend
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
	}
	
	/**
	 * Map转换成Json数据
	 *
	 */
	@Test
	public void javaJsonForMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("四川", "西昌");
		map.put("山东", "济南");
		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);
	}
	
	/**
	 * JavaBean转换成Json数据
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
	 * 将一组JavaBean转换成Json数据
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
	 * Array转换成Json数据
	 *
	 */
	@Test
	public void javaJsonForArray() {
		boolean[] bool = new boolean[]{false,true,false};
		JSONArray jsonArray = JSONArray.fromObject(bool);
		System.out.println(jsonArray);
	}
	
}