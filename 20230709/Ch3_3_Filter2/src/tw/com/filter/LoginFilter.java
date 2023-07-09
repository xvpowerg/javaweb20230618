package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/p2/login.html")
public class LoginFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	HttpServletRequest httpReq = (HttpServletRequest)request;
	HttpServletResponse httpresp = (HttpServletResponse)response;
	HttpSession session =  httpReq.getSession();
	Object login =   session.getAttribute("login");
		if (login != null) {
			httpresp.sendRedirect("../p1/p1_1.html");
			return;
		}
		chain.doFilter(request, response);
		
	}
}
