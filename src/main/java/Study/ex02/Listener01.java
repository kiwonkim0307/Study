package Study.ex02;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("/ex02/s1")
public class Listener01 implements ServletContextListener{
  
  @Override
  public void contextInitialized(ServletContextEvent sce) {
      System.out.println("리스너시작");
  }
  
  @Override
  public void contextDestroyed(ServletContextEvent sce) {

    System.out.println("리스너끝");
  }

}
