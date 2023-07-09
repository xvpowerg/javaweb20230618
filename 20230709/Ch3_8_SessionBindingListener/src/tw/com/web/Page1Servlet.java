package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.MyUser;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			HttpSession session =  req.getSession();
			String acc = "qwer";
			String pass = "12345";
			MyUser myuser = new MyUser(acc,pass);
			session.setAttribute("myuser", myuser);
			session.removeAttribute("myuser");
	}
}
