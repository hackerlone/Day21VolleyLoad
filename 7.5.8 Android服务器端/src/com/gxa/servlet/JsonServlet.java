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

@WebServlet("/json.do")
public class JsonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		map1.put("userid", "liuyang");
		map1.put("password", "123");
		map2.put("userid", "gxaedu");
		map2.put("password", "123456");
		list.add(map1);
		list.add(map2);
		JSONArray jsonArray = JSONArray.fromObject(list);
		String data = jsonArray.toString();
		PrintWriter out = resp.getWriter();
		out.print(data);
		out.flush();
		out.close();
	}
	
}
