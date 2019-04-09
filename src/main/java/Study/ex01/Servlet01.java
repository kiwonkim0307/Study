package Study.ex01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class Servlet01 implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		//서블릿을 실행할 때 사용할 자원을 이 메서드에서 준비한다.
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출된다.
	}
	@Override
	public void destroy() {
		//웹 애플리케이션 종료할 때(서버종료포함) 이 서블릿이 만든 자원을 해제
	}

	@Override
	public ServletConfig getServletConfig() {
		//서블릿 관련 설정 정보를 꺼낼 때 이메서드사용
		
		return null;
	}
	@Override
	public String getServletInfo() {
		return null;
	}

}
