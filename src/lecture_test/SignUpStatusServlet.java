package lecture_test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/signUpStatusServlet")
public class SignUpStatusServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		String title = "Welcome To Annotation!";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		String meta = "<meta charset = \"UTF-8\">\n";
		
		HashMap map = new HashMap();
		map.put("01", "음악감상");
		map.put("02", "독서");
		map.put("03", "음주가무");
		map.put("101", "경기도");
		map.put("102", "전라도");
		map.put("103", "경상도");
		
		String hobbies[] = request.getParameterValues("hobbies");
		String address = request.getParameter("addr");
		String hobby = "";
		String addr = (String) map.get(address);
		for(int i = 0 ; i < hobbies.length ; i++) {
			hobby = hobby + map.get(hobbies[i]) + " ";
		}
		
		out.println(docType + meta + 
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body>\n" +
				" Member ID : " + request.getParameter("email") + "<br>\r\n" +
				" Password1 : " + request.getParameter("password1") + "<br>\r\n" +
				" Password2 : " + request.getParameter("password2") + "<br>\r\n" +
				" name : " + request.getParameter("name") + "<br>\r\n" +
				" addr : " + addr + "<br>\r\n" +
				" hobby : " + hobby + "\r\n" +
				"</body>" +
				"</html>");
	}
}
