package lecture_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/annotations/AnnotationWebServlet")
public class AnnotationWebServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Welcome To Annotation!";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		String meta = "<meta charset = \"UTF-8\">\n";
		
		out.println(docType + meta + 
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body>\n" +
					"<h1>" + title + "</h1>\n" +
				"</body>" +
				"</html>");
	}
	
}
