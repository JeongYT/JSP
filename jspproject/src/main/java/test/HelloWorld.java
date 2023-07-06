package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloWorld() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글인식
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=response.getWriter();
		out.append("<h2> Hello Welcome !! hello </h2><hr>")
		.append("현재 날짜와 시간은 : " + java.time.LocalDateTime.now());
		
		String uid = request.getParameter("id");
		String upw = request.getParameter("pw");
		String upw2 = request.getParameter("pw2");
		String uname = request.getParameter("name");
		String comment = request.getParameter("comment");
		String fruit = request.getParameter("fruit");
		String[] hobby = request.getParameterValues("hobby");
		String it = request.getParameter("it");
		
		String res = "<h3> User Id : " + uid + "</h3>";
			   res += "<h3> User Pw : " + upw + "</h3>";
			   res += "<h3> User PwCheck : " + upw2 + "</h3>";
			   res += "<h3> User Name : " + uname + "</h3>";
			   res += "<h3> User Comment : " + comment + "</h3>";
			   res += "<h3> User favorite Fruit : " + fruit + "</h3>";
			   res += "<h3> User Hobby : ";
			   
			   for(int i=0; i<hobby.length; i++) {
				   res += hobby[i] + ",";
			   }
			   res += "</h3>";
			   res += "<h3> User Programming : " + it + "</h3>";
		response.getWriter().print(res);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	doGet(request, response);
	}
	
	public void doDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().print("to do로 넘김... 방식..");
	}

}
