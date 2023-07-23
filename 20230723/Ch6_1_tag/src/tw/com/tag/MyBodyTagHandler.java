package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class MyBodyTagHandler implements BodyTag{
	private PageContext pc;
	private String message;
	private int counter = 1;
	private Tag parent;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		
		if (counter > 3) {
			return EVAL_PAGE;
		}
		counter++;
		return EVAL_BODY_AGAIN;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
			JspWriter	out =  pc.getOut();
			try {
				out.println("<h1>標籤結束</h1>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter	out =  pc.getOut();
		try {
			String msg = String.format("<h1>%s 標籤開始</h1>",this.getMessage());
			out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
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
	public void setPageContext(PageContext pc) {
		// TODO Auto-generated method stub
		this.pc = pc;
	}

	@Override
	public void setParent(Tag t) {
		// TODO Auto-generated method stub
		this.parent = t;
	}

	@Override
	public void doInitBody() throws JspException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBodyContent(BodyContent b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
