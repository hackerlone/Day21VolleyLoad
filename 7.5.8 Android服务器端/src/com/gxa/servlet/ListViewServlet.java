package com.gxa.servlet;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import net.sf.json.JSONArray;

@WebServlet("/listview.do")
public class ListViewServlet extends HttpServlet {
	
	private static final long serialVersionUID = 702540301035357326L;

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		List<String> list = new ArrayList<>();
		list.add("成都");
		list.add("绵阳");
		list.add("德阳");
		list.add("广汉");
		list.add("新都");
		list.add("龙泉");
		list.add("金堂");
		list.add("邛崃");
		list.add("双流");
		list.add("新津");
		list.add("内江");
		list.add("乐山");
		list.add("峨眉");
		list.add("宜宾");
		list.add("遂宁");
		list.add("隆昌");
		JSONArray jsonArray = JSONArray.fromObject(list); // ["成都","绵阳".....]
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(jsonArray.toString());
		out.flush();
		out.close();
	};
}
