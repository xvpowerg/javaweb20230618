package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private Map<String,String> foodMap = new HashMap<>();
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		foodMap.put("0", "雞腿");
		foodMap.put("1", "排骨");
		foodMap.put("2", "魚排");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out =  resp.getWriter();
//		 String foodId =  req.getParameter("food");
//		 out.println(foodId);
		 String[] foodIds = req.getParameterValues("food");
		 if (foodIds == null) {
			 out.println("請選商品"); 
		 }
		 for (String foodid : foodIds) {
			 out.println(foodid+":"+foodMap.get(foodid)+"<br>");
		 }
	}
}
