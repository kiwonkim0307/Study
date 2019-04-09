package Study.ex02;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter02 implements Filter{
@Override
public void init(FilterConfig filterConfig) throws ServletException {
	// 필터 객체를 생성한 후 제일 첨 호출된다
	// 필터가 사용할 자원을 이 메서드에서 준비한다.
	System.out.println("필터01");
}
	
@Override
	public void destroy() {
	// 웹 애플리케이션이 종료될 때 호출된다.
	//  init()에서 준비한 자원을 해제한다.
	
}

@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//요청이 들어 올 때 마다 호출된다.
		// => 단 필터를 설정 할 대 지정된 URL의 요청에만 호출된다.
		// => 서블릿이 실행되기 전에 필터가 먼저 실행된다.
		// => 서블릿을 실행한 후 다시 필터로 리턴한다.
	System.out.println("필터1.do필터 시작");
	
	chain.doFilter(request, response);
	
	System.out.println("종료");
	
	}
}
