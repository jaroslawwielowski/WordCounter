<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--<%@ page contentType="text/javascript" %>--%>

<%--<html>--%>

<%--<!DOCTYPE html>--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
<center>
    <form method="post" action="/">
        <label>
            <textarea id="customInput" placeholder="wpisz swój tekst" rows="10" cols="100"></textarea><br>
            <input type="submit" value="Sprawdź w Java">
        </label>
    </form>
    <table border="5">
        <tr>
            <td width="300">
                <h1>JavaScript</h1>
                <span>
                    Ilość liter: <span id="charCount">0</span>,<br>
                    Ilość wyrazów: <span id="words">0</span>,<br>
                    Ilość zdań: <span id="questions">0</span>
                </span>
            </td>
            <td width="300">
                <h1>Java</h1>
                Ilość liter: ${chars}
                Ilość wyrazów: ${words}
                Ilość zdań: ${sentences}

            </td>
        </tr>
    </table>
</center>
<script type="text/javascript" src="js/counter.js"></script>
</body>
</html>