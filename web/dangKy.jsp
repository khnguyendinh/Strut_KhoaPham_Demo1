<%-- 
    Document   : dangKy
    Created on : Dec 26, 2017, 12:26:18 PM
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
        <s:form method="post" action="dangki">
            <s:textfield label="userName" name="taiKhoan.userName"></s:textfield>
            <s:password label="Password" name="taiKhoan.passWord"></s:password>
            <s:textfield label="Ho ten" name="taiKhoan.hoTen"></s:textfield>
            <s:submit value="Dang ky" ></s:submit>
        </s:form>
    </body>
</html>
