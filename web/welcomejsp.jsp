<%-- 
    Document   : welcomejsp
    Created on : Aug 31, 2014, 5:17:51 PM
    Author     : Teraesa
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/e" %>
<%@taglib prefix="fri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Personalized Welcome (JSP)</h1>
        
        <p>
            <%
                Object obj= request.getAttribute("Name");
                
                getMessage(Name);
                
                %>
        </p>
    </body>
</html>
