package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");//req�s�X�אּutf-8	
		resp.setContentType("text/html;charset=utf-8");// ��X�]�w��utf-8
		String msg = req.getParameter("msg");
		PrintWriter  out =  resp.getWriter();
		out.println("msg:"+msg);
		out.println("�A�n!");
		System.out.println(msg);
		System.out.println("�ڪ��T��!!");
	}
}
