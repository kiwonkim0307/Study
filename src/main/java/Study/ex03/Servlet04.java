package Study.ex03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s4")
@SuppressWarnings("serial")
public class Servlet04 extends GenericServlet{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	// 서블릿의 환경 정보를 다루는 객체를 먼저 얻는다
	ServletContext ctx = req.getServletContext();
	
	String path = ctx.getRealPath("/WEB-INF/photo.jpeg");
	System.out.println(path);
	
	FileInputStream in = new FileInputStream(path);
	
	res.setContentType("image/jpeg");
	
	BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());
	
	int b;
	while((b = in.read()) !=-1) {
		out.write(b);
	}
	out.flush();
	in.close();
	
}
}
