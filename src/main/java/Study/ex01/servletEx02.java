package Study.ex01;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/s2")
public class servletEx02 extends GenericServlet {

  private static final long serialVersionUID = 1L;

@Override
public void service(ServletRequest req, ServletResponse res)
    throws ServletException, IOException {
  System.out.println("s2");
  
}


}
