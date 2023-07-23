package tw.com.web;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.tools.MaskJsonTools;
import tw.com.tools.MaskNetTools;

@WebServlet(urlPatterns = {"/mask"},asyncSupported = true)
public class MaskServlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			AsyncContext ctx = 	  req.startAsync();
			MaskNetTools.downloadMaskJson(json->{
				
				try {
					ServletRequest newRequest =	 ctx.getRequest(); 
					ServletResponse newResponse=   ctx.getResponse(); 
					MaskJsonTools.maskJsonToObj(json,
							list->{							
								
							newRequest.setAttribute("maskList", list);	
								
							});									
					
					newRequest.getRequestDispatcher("/mask.jsp").
					forward(newRequest, newResponse);
				} catch (IOException | ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					ctx.complete();
				}
				
				
				
			}, ex->{
				System.out.println("Ex:"+ex);				
			});
			
		}
}
