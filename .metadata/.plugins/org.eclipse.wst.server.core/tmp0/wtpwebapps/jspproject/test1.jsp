<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> welcome to my world </h1>
	<h2> 선언문 연습하기 </h2>
	<%! int data = 50; %>
	<%
		out.println("Value of the variable is : " + data);
	%>
	<%!
		String makeItLower(String data) {
			return data.toLowerCase();
		}
	%>
	<%
		out.println(makeItLower("Hellow World") + "<br>");
		System.out.println("콘솔로 출력하기");
	%>
	<%
		int a=2;
		int b=4;
		int sum=a+b;
		out.print("2 + 3 = " + sum);
	%>
	<%
		for(int i=0; i<=10; i++){
			if(i % 2 == 0)
				out.println(i + "<br>");
		}
	%>
	<h2> 표현문 태그 </h2>
	<% int count=0; %>
	Page Count is <%= ++count %>
	<p> Today's date : <%=new Date() %></p>
	<%
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
	%>
	<%=a1 + b1 + c1%>
	<%-- 주석처리 컨트롤+시프트+/ --%>
	
	<% 
		String greeting = "Welcome to Web Shooping Mall";
		String line="안녕하세요";
	%>
	<h1> <%= greeting %></h1>
	<h2> <%= line %></h2>
</body>
</html>