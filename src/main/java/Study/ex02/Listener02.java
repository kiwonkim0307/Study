package Study.ex02;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class Listener02 implements ServletRequestListener{
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// 요청이 들어 왓을때 호출
		System.out.println("l2s");

	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		//요청 처리를 완료ㅎ할 때 호출
		System.out.println("l2e");
	}
}
