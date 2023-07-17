package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.Item;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				Item im1 = new Item(1,"Item1");
				Item im2 = new Item(2,"Item2");
				Item im3 = new Item(3,"Item3");
				Item im4 = new Item(4,"Item4");
				Item im5 = new Item(5,"Item5");
				ArrayList<Item> list = new ArrayList<>();
				list.add(im1);
				list.add(im2);
				list.add(im3);
				list.add(im4);
				list.add(im5);
				HttpSession session = req.getSession();
				session.setAttribute("itemList", list);
				req.getRequestDispatcher("/page1.jsp").
				forward(req, resp);
		}
}
