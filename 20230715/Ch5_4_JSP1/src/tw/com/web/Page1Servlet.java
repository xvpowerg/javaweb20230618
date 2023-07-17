package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg =  req.getParameter("value1");
		ServletContext app =   this.getServletContext();
		
		app.setAttribute("appValue", "AppValues");
		req.setAttribute("msg",msg);
		req.getRequestDispatcher("page1.jsp").forward(req, resp);
	}
}
