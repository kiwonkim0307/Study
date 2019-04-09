package Study.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s3")
@SuppressWarnings("serial")
public class Servlet03 extends GenericServlet{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	req.setCharacterEncoding("UTF-8");
	
	int age = Integer.parseInt(req.getParameter("age"));
	String name = req.getParameter("name");
	String photo = req.getParameter("photo");
	
	res.setContentType("text/plain;charset=UTF-8");
	PrintWriter out = res.getWriter();
	out.println(name);
	out.println(age);
	out.println(photo);
	
}
}
