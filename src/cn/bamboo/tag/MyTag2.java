package cn.bamboo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * SimpleTagSupport实现了SimpleTag接口
 * 它已经把所有的Tomcat传递的的数据都保存起来了,而且还提供了get方法供子类调用!
 * */
public class MyTag2 extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		this.getJspContext().getOut().print("再Hello一次Tag");
		
	}
}
