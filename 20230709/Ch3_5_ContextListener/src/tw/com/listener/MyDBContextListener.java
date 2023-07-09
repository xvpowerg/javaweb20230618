package tw.com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.beans.DBInfo;
@WebListener
public class MyDBContextListener implements ServletContextListener {
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			// TODO Auto-generated method stub
			//容器啟動呼叫
			System.out.println("DB Init!");
			ServletContext cntext = sce.getServletContext();
			cntext.setAttribute("myValue", "MyValueTest!!!");
			
			String dbName = cntext.getInitParameter("dbName");
			String dbPass =  cntext.getInitParameter("dbPassword");
			DBInfo dbInfo = new DBInfo(dbName,dbPass);
			DBInfo.setDefaultDBInfo(dbInfo);
		}
		@Override
		public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
			//容器停止呼叫	
			
			System.out.println("DB Destroy!");
		}
}
