package tw.com.bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyUser implements HttpSessionBindingListener {
	private String acc;
	private String pass;
	public MyUser(String acc, String pass) {
		super();
		this.acc = acc;
		this.pass = pass;
	}
	public String getAcc() {
		return acc;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		return "MyUser [acc=" + acc + ", pass=" + pass + "]";
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Add User:"+this);
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Remove User:"+this);
	}
}
