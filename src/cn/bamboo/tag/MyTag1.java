package cn.bamboo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;

/**
 * 自定义标签 1
 * 
 * **/
public class MyTag1 implements SimpleTag{

	private PageContext pageContext;
	private JspFragment body;
	
	/**
	 * 所有的setXxx()方法都会在doTag()方法之前被调用!
	 * 所以在doTag()就可以使用tomcat传递过来的对象了
	 * */
	@Override
	public void doTag() throws JspException, IOException {
		pageContext.getOut().print("Hello Tag");
	}

	@Override
	public JspTag getParent() {
		return null;
	}

	@Override
	public void setJspBody(JspFragment body) {
		this.body=body;
	}

	@Override
	public void setJspContext(JspContext context) {
		this.pageContext=(PageContext)context;
	}

	@Override
	public void setParent(JspTag parent){}

}
