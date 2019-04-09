package Study.ex02;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener01  implements ServletContextListener{
 // 서블릿 컨테이너를 시작하거나 종료할 때 보고 받고 싶다면 이 인터페이스를 구현하라.

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//웹 애플리케이션이 시작될 때 호출된다.
		System.out.println("l1s");
	}
	@Override
		public void contextDestroyed(ServletContextEvent sce) {
	//웹 에플리케이션이 종료될 때 호출된다
		System.out.println("l1e");
	}
}
