<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="it" uri="/WEB-INF/tlds/bamboo-tag.tld"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>

	<it:myTag5 test="${empty param.xxx}">
			<it:myTag4 />
	</it:myTag5>
		
		<!--此标签执行后，下面的内容将不显示  -->
	

	<h1>
		<it:myTag1 />
	</h1>
	<br>
	<h1>
		<it:myTag2 />
	</h1>

	<hr />
	<%
		request.setAttribute("he", "bamboo");
	%>
	<h3>
		<it:myTag3>
			${he }
		</it:myTag3>
	</h3>
	<it:myTag4 />
	<!--此标签执行后，下面的内容将不显示  -->
	<h3>hehe</h3>
</body>
</html>
