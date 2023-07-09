package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		ServletContext application = getServletContext();
		Object obj = application.getAttribute("count");
		int count = 0;
		if (obj != null) {
			count = (Integer)obj;
		}
		application.setAttribute("count", ++count);
		out.println(count);
		String dbName = application.getInitParameter("dbName");
		String dbPassword = application.getInitParameter("dbPassword");
		out.println(dbName);
		out.println(dbPassword);
	}
}
