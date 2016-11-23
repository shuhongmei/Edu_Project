<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>User Register Page</title>
    
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
    <s:form action="register">
    	<s:textfield name="username" label="用户名"></s:textfield>
    	<s:password name="password" label="密码"></s:password>
    	<s:select list="#{'1':'男','0':'女' }" listKey="key" listValue="value" name="gender" label="性别" value="1"></s:select>
    	<s:submit value="注册"></s:submit>
    	<a href="index.jsp">已经有账户，进行登录</a>
    </s:form>
  </body>
</html>
