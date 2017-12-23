<%-- 
    Document   : hello
    Created on : Dec 22, 2017, 11:47:35 PM
    Author     : lampstudio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World 1!</h1><br/>
        ${hoTen}
        <h3>Thông tin sản phầm</h3>
        Mã sản phẩm :${sanPham.maSP}<br/>
        Tên sản phẩm :${sanPham.tenSP}<br/>
        Giá sản phẩm :${sanPham.giaSP}<br/>
    </body>
</html>
