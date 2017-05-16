<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
</head>
<body>
<form action="<c:url value="/"/>" method="post">
    <label>
        <input type="number" name="num1" id="num1">
    </label>
    <label for="op_select"> </label>
    <select class="custom-select" name=op id=op_select>
        <option value="1">+</option>
        <option value="2">-</option>
        <option value="3">/</option>
        <option value="4">*</option>
    </select>
    <label>
        <input type="number" name="num2" id="num2">
    </label>
    <label>
        <button type="submit" value="/">Отправить</button>
    </label> <br> <br>


</form>

<div >
    <h3 class="h3"> RESULT: ${result} </h3>

</div>
</body>
</html>
