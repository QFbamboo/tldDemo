package cn.bamboo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 有属性的标签
 * */
public class MyTag5 extends SimpleTagSupport {

	private boolean test;

	/**
	 * 这个方法 会由tomcat来调用，并且在doTag()之前
	 * */
	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if (test) {
			/**
			 * 执行标签体
			 * */
			this.getJspBody().invoke(null);// 如果传递的输出流为Null,表示使用的就是当前页面的out
		}
	}

}
