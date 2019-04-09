package Study.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/ex04/s1")
public class Servlet01 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			
			res.setContentType("text/plain;charset=UTF-8");
			PrintWriter out = res.getWriter();
			out.println(name);
			out.println(age);
		
	}
}
