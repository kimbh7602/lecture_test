package lecture_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/signUpFormServlet")
public class SignUpFormServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // 브라우저가 해석하는 방식이 달라짐
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		String host = request.getContextPath();
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" +
				"  <head>\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n" + 
				"    <title>bootstrap template</title>\r\n" + 
				"	<!-- jQuery -->\r\n" + 
				"	<script src = \"../js/jquery-3.3.1.min.js\"></script>\r\n" + 
				"    <!-- Bootstrap -->\r\n" + 
				"    <link href=\"" + host + "/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + 
				"    <!-- font awesome -->\r\n" + 
				"    <link rel=\"stylesheet\" href=\"" + host + "/resources/css/font-awesome.min.css\" media=\"screen\" title=\"no title\" >\r\n" + 
				"    <!-- Custom style -->\r\n" + 
				"    <link rel=\"stylesheet\" href=\"" + host + "/resources/css/style.css\" media=\"screen\" title=\"no title\">\r\n" + 
				"\r\n" + 
				"    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n" + 
				"    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n" + 
				"    <!--[if lt IE 9]>\r\n" + 
				"      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n" + 
				"      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n" + 
				"    <![endif]-->\r\n" + 
				"    \r\n" + 
				"  </head>\r\n" + 
				"  <body>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"      <article class=\"container\">\r\n" + 
				"        <div class=\"page-header\">\r\n" + 
				"          <h1>SignUp <small>basic form</small></h1>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"col-md-6 col-md-offset-3\">\r\n" + 
				"          <form name = \"sign-up\" role=\"form\" onsubmit = \"return check()\" action = \"" + host + "/signUpStatusServlet\" method = \"POST\">\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"              <label for=\"InputEmail\">E-mail</label>\r\n" + 
				"              <input type=\"email\" name = \"email\" class=\"form-control\" id=\"InputEmail\" placeholder=\"E-mail\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"              <label for=\"InputPassword1\">Password</label>\r\n" + 
				"              <input type=\"password\" name = \"password1\" class=\"form-control\" id=\"InputPassword1\" placeholder=\"password\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"              <label for=\"InputPassword2\">Check Password</label>\r\n" + 
				"              <input type=\"password\" name = \"password2\" class=\"form-control\" id=\"InputPassword2\" placeholder=\"password check\">\r\n" + 
				"              <p class=\"help-block\">please write password one more time for check your password</p>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"              <label for=\"username\">Name</label>\r\n" + 
				"              <input type=\"text\" name = \"name\" class=\"form-control\" id=\"username\" placeholder=\"Please write your name\">\r\n" + 
				"            </div>\r\n" + 
				"<div class=\"btn-group\" data-toggle=\"buttons\">\r\n" + 
				"  <label class=\"btn-toggle btn-secondary active\">\r\n" + 
				"    <input type=\"checkbox\" name = \"hobbies\" value = \"01\" checked autocomplete=\"off\"> 음악감상\r\n" + 
				"  </label>\r\n" + 
				"  <label class=\"btn-toggle btn-secondary\">\r\n" + 
				"    <input type=\"checkbox\" name = \"hobbies\" value = \"02\" autocomplete=\"off\"> 독서\r\n" + 
				"  </label>\r\n" + 
				"  <label class=\"btn-toggle btn-secondary\">\r\n" + 
				"    <input type=\"checkbox\" name = \"hobbies\" value = \"03\" autocomplete=\"off\"> 음주가무\r\n" + 
				"  </label>\r\n" + 
				"</div>" +
				"<div class=\"btn-group\" data-toggle=\"buttons\">\r\n" + 
				"  <label class=\"btn-radio btn-secondary active\">\r\n" + 
				"    <input type=\"radio\" name=\"addr\" value = \"101\" id=\"option1\"  autocomplete=\"off\" checked> 경기도\r\n" + 
				"  </label>\r\n" + 
				"  <label class=\"btn-radio btn-secondary\">\r\n" + 
				"    <input type=\"radio\" name=\"addr\" value = \"102\" id=\"option2\" autocomplete=\"off\"> 전라도\r\n" + 
				"  </label>\r\n" + 
				"  <label class=\"btn-radio btn-secondary\">\r\n" + 
				"    <input type=\"radio\" name=\"addr\" value = \"103\" id=\"option3\" autocomplete=\"off\"> 경상도\r\n" + 
				"  </label>\r\n" + 
				"</div>" +
				"            <div class=\"form-group\">\r\n" + 
				"                <label>Agree sub</label>\r\n" + 
				"              <div data-toggle=\"buttons\">\r\n" + 
				"              <label class=\"btn btn-primary active\">\r\n" + 
				"                  <span class=\"fa fa-check\"></span>\r\n" + 
				"                  <input id=\"agree\" type=\"checkbox\" autocomplete=\"off\" checked>\r\n" + 
				"              </label>\r\n" + 
				"              <a href=\"#\">Agree</a>subscription\r\n" + 
				"              </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group text-center\">\r\n" + 
				"              <button type=\"submit\" class=\"btn btn-info\">SignUp<i class=\"fa fa-check spaceLeft\"></i></button>\r\n" + 
				"              <button type=\"submit\" class=\"btn btn-warning\">Cancel<i class=\"fa fa-times spaceLeft\"></i></button>\r\n" + 
				"            </div>\r\n" + 
				"          </form>\r\n" + 
				"        </div>\r\n" + 
				"      </article>\r\n" + 
				"\r\n" + 
				"    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n" + 
				"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n" + 
				"    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n" + 
				"    <script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n" + 
				"  </body>\r\n" + 
				"</html>\r\n" + 
				"");
	}
}
