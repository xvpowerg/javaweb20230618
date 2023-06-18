package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
   
	//HttpServletRequest ¿é¤J
	//HttpServletResponse ¿é¥X
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException {
		System.out.println("Test Info");
		PrintWriter out =   resp.getWriter();
		ArrayList<String> list = new ArrayList();
		list.add("Ken");
		list.add("Vivin");
		list.add("Lindy");
		list.add("Joy");
		//out.print("Hello!!");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>MyPage1!!</title>");	
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Apple</p>");
		out.println("<p>Banana</p>");
		for (String name: list) {
			out.println("<p>"+name+"</p>");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
	
}
