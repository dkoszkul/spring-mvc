<%--
  Created by IntelliJ IDEA.
  User: koszkul
  Date: 22.03.2020
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>CartItems</title>
</head>
<body>
    <c:forEach items="${cartItems}" var="cartItem">
        ${cartItem.quantity} : ${cartItem.product.name} / ${cartItem.product.price} <br/>
    </c:forEach>

</body>
</html>
