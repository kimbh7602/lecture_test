package lecture_test;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


@WebFilter(urlPatterns = {"/security/*"}, initParams = {
		@WebInitParam(name = "test-param", value = "Initialization Parameter")
})
public class AnnotationLogFilterServlet implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
		String testParam = config.getInitParameter("test-param");
		System.out.println("Test Param : " + testParam);
		System.out.println("init Time : " + new Date().toString());
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter Time : " + new Date().toString());
		response.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destoy Time : " + new Date().toString());
	}

}
