package tw.com.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/page1/*")
public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Do Filter 1");
		chain.doFilter(request, response);//����chain.doFilter�M�w�O�_�i�J�������
		System.out.println("Do Filter 2:"+request.getAttribute("mypage1"));
		
	}

}
