<%--
  Created by IntelliJ IDEA.
  User: nebel
  Date: 9/25/21
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" import="java.util.*, core.model.DAO "%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="emblem.html" %>
<%
    String fullname = " ";
    String email = " ";
    if(request.getParameter("do_this").compareToIgnoreCase("addcourse") != 0){
        fullname = request.getParameter("fname");
        email = request.getParameter("email");
    }
    Vector courseList = DAO.getDAOInstance().getCourseList();
    List<String> basketCourse = new ArrayList<>();
%>
<nav>
    <h3>Welcome <%= fullname.toUpperCase() %> | <%= email %></h3>
</nav>

<article>
    <h2>Create new matricule for current session</h2>
    <form name="addForm"  method="POST">
        <input type="hidden" name="do_this" value="addcourse">
        Courses:
        <select name="course">
            <% // Scriptlet 2: copy the book list to the selection control
                for (int i = 0; i < courseList.size(); i++) {
                    out.println("<option>" + (String) courseList.elementAt(i) + "</option>");
                }
            %>
        </select>
        <input type="submit" value="Add to Cart">
    </form>
</article>

<aside>
    <%
//        if (!basketCourse.isEmpty()){
    %>
    <h3>How many courses <% request.getParameter("course"); %></h3>
    <%
//        }
    %>
</aside>

<section>
    <h2>This is another headline</h2>
    <div class="someclass">
        This is another text.
    </div>
    <div class="someclass">
        This is another text.
    </div>
</section>

<%@ include file="footer_page.html" %>
<script src="/assets/js/scripts.js"></script>
</body>
</html>
