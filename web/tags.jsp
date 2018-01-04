<%-- 
    Document   : tags
    Created on : Dec 26, 2017, 5:28:42 PM
    Author     : lampstudio
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP TAGS</title>
    </head>
    <body>
        <s:url var="hellolink" >
            <s:param name="userNam">khoa oi</s:param>
        </s:url>
        <h1>Hello World!</h1>
        <p><a href="${hellolink}">kooooooo</a></p>
        <s:set id="oooookkk" value="oioioi"></s:set>
        <p>"${ooookkk}"</p>
    </body>
</html>
