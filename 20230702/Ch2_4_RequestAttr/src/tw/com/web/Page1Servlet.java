package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.obj.Shape;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String height  =  req.getParameter("h");
		String weight = req.getParameter("w");
		Shape shape = new Shape(Float.parseFloat(height),
					Float.parseFloat(weight));
		//Servlet之間的轉換
		req.setAttribute("myshape", shape);
		req.getRequestDispatcher("/page2").
		forward(req, resp);
		
	}
}
