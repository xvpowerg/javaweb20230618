package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag {
	private Tag parent;
	private PageContext pc;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out =   pc.getOut();
		try {
			out.println("<font size=5 color='blue'>離開!!</font>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_PAGE;//EVAL_PAGE 繼續執行其他的JSP
	}
	

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out =   pc.getOut();
		try {
			out.println("<font size=5 color='blue'>開始!!</font>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_PAGE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext arg0) {
		// TODO Auto-generated method stub
		pc = arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		parent = arg0;
	}

}
