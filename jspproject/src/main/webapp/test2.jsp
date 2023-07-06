<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page info="Date 클래스를 이용한 날짜 출력하기" %>
<%@ page errorPage = "error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	// String str = null;
	String str = "welcome";
	out.println(str.toString());
%>
<%@ include file="header.jsp" %>
<h4>----------- 현재 페이지 영역 -------------</h4>
<%@ include file="footer.jsp" %>
</body>
</html>