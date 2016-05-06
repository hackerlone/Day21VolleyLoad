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
		list.add("�ɶ�");
		list.add("����");
		list.add("����");
		list.add("�㺺");
		list.add("�¶�");
		list.add("��Ȫ");
		list.add("����");
		list.add("����");
		list.add("˫��");
		list.add("�½�");
		list.add("�ڽ�");
		list.add("��ɽ");
		list.add("��ü");
		list.add("�˱�");
		list.add("����");
		list.add("¡��");
		JSONArray jsonArray = JSONArray.fromObject(list); // ["�ɶ�","����".....]
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(jsonArray.toString());
		out.flush();
		out.close();
	};
}
