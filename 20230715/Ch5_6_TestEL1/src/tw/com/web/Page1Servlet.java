package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.Item;
import tw.com.beans.User;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			req.setAttribute("MyRequest", "RequestMsg");
			
			
			HttpSession session  = req.getSession();
			ServletContext app =  this.getServletContext();
			
			Item item1 = new Item("Item1",100);
			User user1 = new User("User1",25);
			session.setAttribute("Item1", item1);
			app.setAttribute("User1", user1);
			
			Map<String,User> myUserMap = new HashMap<>();
			myUserMap.put("user1", new User("user1",17));
			myUserMap.put("user2 Ken", new User("Ken",25));
			session.setAttribute("userMap", myUserMap);
			
			
			List<User> arrayList = new ArrayList();
			arrayList.add(new User("User2",21));
			arrayList.add(new User("User3",18));
			arrayList.add(new User("User4",16));
			arrayList.add(new User("User5",30));
			session.setAttribute("userList", arrayList);
			
			req.getRequestDispatcher("page1.jsp").
			forward(req, resp);
		}
}
