<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String u1=request.getParameter("uname");
String p1=request.getParameter("pass");

if(u1.equals("admin")&&p1.equals("admin"))
{
	HttpSession sess=request.getSession(true);
	sess.setAttribute("k1", u1);
	RequestDispatcher dis=request.getRequestDispatcher("sucess.jsp");
	dis.forward(request, response);
}
else
{
	RequestDispatcher dis=request.getRequestDispatcher("index.jsp");
	out.println("LoginFail!!!");
	dis.include(request, response);
}

%>
</body>
</html>