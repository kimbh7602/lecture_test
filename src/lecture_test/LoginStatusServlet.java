package lecture_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/security/loginStatusRequest")
public class LoginStatusServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String title = "Welcome To Annotation!";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		String meta = "<meta charset = \"UTF-8\">\n";
		
		out.println(docType + meta + 
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body>\n" +
				" ¸â¹ö ID : " + request.getParameter("email") + "\n" +
				" Password : " + request.getParameter("password") + "\n" +
				"</body>" +
				"</html>");
	}
}
