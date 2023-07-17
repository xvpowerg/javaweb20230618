package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private ExecutorService es;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
	}
	
	private void run() {			
			try {
				for (int i = 1;i<=50;i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);	
					TimeUnit.SECONDS.sleep(1);	
				}				
			}catch(Exception ex) {
				
			}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter  out = resp.getWriter();
		out.println("page1!!"+Thread.currentThread().getName());		
		es.execute(this::run);
	
		
	}
}
