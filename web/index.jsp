<%-- 
    Document   : index
    Created on : Dec 22, 2017, 11:42:15 PM
    Author     : lampstudio
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:a action="hello">Hello nao</s:a><br/>
        <br/>
        <br/>
        <s:a action="hienthi">Hien thi nao</s:a>
        <br/>
        <s:a href="dangnhap.jsp">Dang nhap</s:a>
        <br/>
        <s:a href="dangKy.jsp">Dang ki</s:a>
        <br/>
        <s:a href="tags.jsp">Tags</s:a>
    </body>
</html>
