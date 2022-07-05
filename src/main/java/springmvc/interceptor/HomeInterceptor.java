package springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class HomeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre handler called");
		String password = request.getParameter("password");
		if(password.isBlank()) {
			System.out.println("password is blank");
			response.setContentType("text/html");
			response.getWriter().println("<h1>password is blank</h1>");
			return false;
		}
		return true;
	}

}
