package lecture_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // 브라우저가 해석하는 방식이 달라짐
		
		PrintWriter out = response.getWriter();
		String name = "Kim";
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>Welcome To YoJuLab !</h1>\r\n" + 
				"<h1>" + name + "</h1>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}
