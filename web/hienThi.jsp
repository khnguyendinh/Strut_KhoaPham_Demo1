<%-- 
    Document   : hienThi
    Created on : Dec 22, 2017, 11:56:47 PM
    Author     : lampstudio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>hien thi dc roi nhe!</h1>
        <br/>
        <h3>Danh sách sản phầm</h3><br/>
        <c:forEach var="sp" items="${dsSP}">
            Mã sản phẩm :${sp.maSP}<br/>
            Tên sản phẩm :${sp.tenSP}<br/>
            Giá sản phẩm :${sp.giaSP}<br/>
            ===========================<br/>
        </c:forEach>
</body>
</html>
