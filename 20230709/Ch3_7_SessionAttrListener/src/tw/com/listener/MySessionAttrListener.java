package tw.com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MySessionAttrListener 
		implements HttpSessionAttributeListener{
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Add");
		String name = event.getName();
		Object obj =  event.getValue();
		System.out.println("name:"+name);
		System.out.println("Value:"+obj);
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Remove");
		String name = event.getName();
		Object obj =  event.getValue();
		System.out.println("name:"+name);
		System.out.println("Value:"+obj);
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Replace");
		String name = event.getName();
		Object obj =  event.getValue();//取的是舊值
		Object obj2 =  event.getSession().getAttribute(name);//取得新值
		System.out.println("name:"+name);
		System.out.println("Value:"+obj);
		System.out.println("Value2:"+obj2);
	}
}
