package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	private int[] values = new int[5000];
	//init()只會執行一次
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		Random ran = new Random();
		for (int i = 0; i < values.length;i++) {
			values[i] = ran.nextInt(1000000);
		}		
		System.out.println("Page1Servlet Init");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out = 	 resp.getWriter();
	out.println(values[5]);
	ServletContext sc = getServletContext();	
	sc.setAttribute("A", "Test!!");
	System.out.println(sc);
	//每使用者會有一個執行序為他們服務
	System.out.println("Thread:"+Thread.currentThread().getName());
	}
	
}
