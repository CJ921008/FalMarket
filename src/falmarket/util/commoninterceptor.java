package falmarket.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class commoninterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		
//		log.info("���ʵ�ַΪ��"+requestUri);
//		log.info("��Ŀ·��Ϊ��"+contextPath);
//		log.info("URLΪ��"+url);
		String username = sessionUtil.getUsername(session);
		if(username.isEmpty()){
//			log.info("��������ת��loginҳ��");
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			return false;
		}else{
			return true;			
		}
	}
}
