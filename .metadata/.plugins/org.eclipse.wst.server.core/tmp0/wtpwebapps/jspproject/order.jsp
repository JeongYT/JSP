<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>���ͳ� ���α׷��� ����</h1>
  <h3>������ �Է��ϼ���:</h3>
  <form method="post">
     å ����:    <input type="text" name="title"><br>
    <input type="submit" value="�˻�">
  </form>
 
  <%
    String title = request.getParameter("title");

    if (title != null) {
  %>
  <%
      Class.forName("com.mysql.jdbc.Driver");

      Connection conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/testdb?useSSL=false", "root", "1234"); 
      Statement stmt = conn.createStatement();
 
      String sqlStr = "SELECT * FROM books WHERE title LIKE ";
	  sqlStr += "'%" + title +"%'";
      sqlStr += "ORDER BY title ASC";
      
      ResultSet rset = stmt.executeQuery(sqlStr);
  %>
      <hr>
      <form method="post" action="orderproc.jsp">
        <table border=2>
          <tr>
            <th>�ֹ�</th>
            <th>����</th>
            <th>����</th>
            <th>����</th>
            <th>����</th>
          </tr>
  <%
      while (rset.next()) {
        int id = rset.getInt("id");
  %>
          <tr>
            <td><input type="checkbox" name="id" value="<%= id %>"></td>
            <td><%= rset.getString("author") %></td>
            <td><%= rset.getString("title") %></td>
            <td><%= rset.getInt("price") %>��</td>
            <td><%= rset.getInt("qty") %>��</td>
          </tr>
  <%
      }
  %>
        </table>
        <br>
        <input type="submit" value="�ֹ�">
        <input type="reset" value="�ʱ�ȭ">
      </form>
      <a href="<%= request.getRequestURI() %>"><h3>�ٽ� �ֹ��ϱ�</h3></a>
  <%
      rset.close();
      stmt.close();
      conn.close();
    }
  %>
</body>
</html>