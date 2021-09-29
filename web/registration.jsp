<%--
  Created by IntelliJ IDEA.
  User: nebel
  Date: 9/25/21
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTRATION</title>
</head>
<body>
<%@ include file="emblem.html" %>
<article>
    <h3>Enrollment for new students</h3>
    <form id="registerForm" action="profile.jsp" method="post">
        <input type="hidden" name="do_this" value="adduser">
        <table id="tableform">
            <tr>
                <td>Firstname</td>
                <td><input type="text" name="fname"/></td>
            </tr>
            <tr>
                <td>Lastname</td>
                <td><input type="text" name="lname"/></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>
</article>
<%@ include file="footer_page.html" %>
</body>
</html>
