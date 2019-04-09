package Study.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/ex04/s7")
public class Servlet07 extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
			req.setCharacterEncoding("UTF-8");

			 res.setContentType("text/plain;charset=UTF-8");
			    PrintWriter out = res.getWriter();
			    
			    out.printf("a = %s\n", req.getParameter("a"));
			    out.printf("b = %s\n", req.getParameter("b"));
			    
			    // 파라미터 이름 자체가 없으면 getParameter()는 null을 리턴한다.
			    out.printf("c = %s\n", req.getParameter("c"));
		
	}

}
