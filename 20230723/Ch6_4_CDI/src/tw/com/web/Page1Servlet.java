package tw.com.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.MyApple;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Inject
		private MyApple myApple;
		@Override
		protected void doGet(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println(myApple);
		}
}
