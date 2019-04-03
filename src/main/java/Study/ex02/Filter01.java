package Study.ex02;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/ex02/s1")
public class Filter01 implements Filter{

@Override
public void init(FilterConfig filterConfig) throws ServletException {
  System.out.println("f1.init");
  
}
@Override
  public void destroy() {
  System.out.println("f1.destroy");
}

@Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
   System.out.println("do필터 시작");
   
   chain.doFilter(request, response);
   
   System.out.println("do필터 종료");
    
  }
}
