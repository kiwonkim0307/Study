package Study.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s2")
@SuppressWarnings("serial")
public class Servlet02 extends GenericServlet{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	res.setContentType("text/plain;charset=UTF-8");
	PrintWriter out = res.getWriter();
	out.println("hello");
	out.println("안녕하세요");
	
	
}
}
