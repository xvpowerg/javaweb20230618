package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.Map;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String countStr = req.getParameter("count");
		Map<String,String[]> pMap =  req.getParameterMap();
		pMap.forEach((k,v)->{
			
			System.out.println(k+":"+v[0]);
		});
		Optional<String> countOp = Optional.ofNullable(countStr);
		int count = Integer.parseInt(countOp.orElse("0"));
//		if (countStr != null) {
//			count = Integer.parseInt(countStr);
//		}
	
		System.out.println(count);
		StringBuilder sb = new StringBuilder();
		for (int i =0;i<count;i++) {
			char v = (char)('A'+i);
			sb.append("<li>"+v+"</li>");
		}
		//HTML
		out.println("<HTML>");
			out.println("<body>");
			out.println("<ol>");	
			out.println(sb.toString());
			out.println("</ol>");
			out.println("</body>");
		out.println("</HTML>");
	}
}
