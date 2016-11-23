package cn.bamboo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag4 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		this.getJspContext().getOut().print("只能看到我,下面的不给它显示");
		throw new SkipPageException();//抛出这个异常后,在本标签后的内容将不显示
		
	}

}
