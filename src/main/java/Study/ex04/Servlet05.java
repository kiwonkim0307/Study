package Study.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

@WebServlet("/ex04/s5")
public class Servlet05 extends GenericServlet {
  
  private static final long serialVersionUID = 1L;
  private String uploadDir;
  
  @Override
  public void init() throws ServletException {
   
    this.uploadDir = this.getServletContext().getRealPath("/upload");
  System.out.println(uploadDir);
  }
  
  
  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
	  
	  req.setCharacterEncoding("UTF-8");
	  HttpServletRequest httpReq = (HttpServletRequest) req;
	  
	  res.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = res.getWriter();
	    out.println("<html>");
	    out.println("<head><title>servlet04</title></head>");
	    out.println("<body><h1>파일 업로드 결과</h1>");
	    
	    // 일반 폼 데이터를 원래 하던 방식대로 값을 꺼낸다.
	    out.printf("이름=%s<br>\n", httpReq.getParameter("name"));
	    out.printf("나이=%s<br>\n", httpReq.getParameter("age"));
	    
	    Part photoPart = httpReq.getPart("photo");
	    String filename ="";
	    if(photoPart.getSize()>0) {
	    	filename=UUID.randomUUID().toString();
	    	photoPart.write(this.uploadDir+"/"+filename);
	    }
	    out.printf("사진=%s<br>\n", filename);
	    out.printf("<img src='../upload/%s'><br>\n", filename);
	    out.println("</body></html>");
  }
}







