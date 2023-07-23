package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MsgHelloTag extends TagSupport {
		
	private String message;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		PageContext pc =  this.pageContext;
		JspWriter out =    pc.getOut();
		String msg = String.format("<font size='6' color='red'>%s你好 End</font>",this.getMessage());
		try {
			out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		PageContext pc =  this.pageContext;
		JspWriter out =    pc.getOut();
		String msg = String.format("<font size='6' color='red'>%s你好 Start</font>",this.getMessage());
		try {
			out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
