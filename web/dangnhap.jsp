<%-- 
    Document   : dangnhap
    Created on : Dec 25, 2017, 11:19:38 AM
    Author     : lampstudio
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page dang nhap</title>
    </head>
    <s:form method="post" action="dangnhap">
        <s:textfield name="userName" label="userName"  ></s:textfield>
            <br>
        <s:password name="password" label="password"  ></s:password><br>

            <br>
        <s:submit value="Login"></s:submit>
    </s:form>
    <s:div id="loginFail" cssStyle="display=none">dang nhap that bai</s:div>
    <script>
    </script>
</html>
