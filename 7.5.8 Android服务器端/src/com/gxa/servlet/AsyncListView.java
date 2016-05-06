package com.gxa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

@WebServlet("/asynclistview.do")
public class AsyncListView extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getParameter("url");
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> map01 = new HashMap<String, Object>();
		map01.put("img", url+"/android_01.jpg");
		map01.put("title", "Android面试题解密-自定义View");
		map01.put("info", "学习人数:4217");
		list.add(map01);
		
		Map<String, Object> map02 = new HashMap<String, Object>();
		map02.put("img", url+"/android_02.jpg");
		map02.put("title", "AC2015前端技术大会");
		map02.put("info", "学习人数:5678");
		list.add(map02);
		
		Map<String, Object> map03 = new HashMap<String, Object>();
		map03.put("img", url+"/android_03.jpg");
		map03.put("title", "MongoDB复制集-相关特性");
		map03.put("info", "学习人数:3378");
		list.add(map03);
		
		Map<String, Object> map04 = new HashMap<String, Object>();
		map04.put("img", url+"/android_04.jpg");
		map04.put("title", "R语言基础");
		map04.put("info", "学习人数:13378");
		list.add(map04);
		
		Map<String, Object> map05 = new HashMap<String, Object>();
		map05.put("img", url+"/android_05.jpg");
		map05.put("title", "IOS9新特性-UITesting");
		map05.put("info", "学习人数:10521");
		list.add(map05);
		
		Map<String, Object> map06 = new HashMap<String, Object>();
		map06.put("img", url+"/android_06.jpg");
		map06.put("title", "Phthon开发轻量级爬虫");
		map06.put("info", "学习人数:16581");
		list.add(map06);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONArray jsonArray = JSONArray.fromObject(list);
		out.print(jsonArray.toString());
		out.flush();
		out.close();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
