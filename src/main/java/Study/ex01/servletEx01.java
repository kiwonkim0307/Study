package Study.ex01;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/s1")
public class servletEx01 implements Servlet {

  ServletConfig config;

  @Override
  public void init(ServletConfig config) throws ServletException {
    this.config = config;
    System.out.println("Servlet01.init");
  }
  
  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    System.out.println("servlet01.service");
  }

  @Override
  public void destroy() {
    System.out.println("servle01.destroy()");
  }
  
  @Override
  public ServletConfig getServletConfig() {
    return this.config;
  }
  
  @Override
  public String getServletInfo() {
    return "Servlet01";
  }





}
