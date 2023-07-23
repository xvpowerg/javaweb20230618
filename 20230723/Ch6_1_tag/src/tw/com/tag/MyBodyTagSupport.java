package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MyBodyTagSupport extends BodyTagSupport{
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		BodyContent bc =   getBodyContent();
		String msg = bc.getString();
		JspWriter out =  bc.getEnclosingWriter();
		
		if (msg != null) {
			try {
				out.println(msg.toUpperCase());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return SKIP_BODY;
	}
}
