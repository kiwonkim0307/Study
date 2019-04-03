package Study.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/ex04/s2")
public class Servlet02 extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			
	req.setCharacterEncoding("UTF-8");
	String name = req.getParameter("name");
	int age = Integer.parseInt(req.getParameter("age"));
	
	System.out.println(name);
	System.out.println(age);
	
	res.setContentType("text/plain;charset=UTF-8");
	PrintWriter out = res.getWriter();
	out.println(name);
	out.println(age);
	
	
	}
	
}
