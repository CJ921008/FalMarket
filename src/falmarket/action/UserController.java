package falmarket.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import falmarket.service.IUserService;
import falmarket.util.sessionUtil;

@Controller
public class UserController {
	
	@Resource
	private IUserService userservice;
	
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username = request.getParameter("username")==null?"":request.getParameter("username").toString();
		String password = request.getParameter("password")==null?"":request.getParameter("password").toString();
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = userservice.getUserByLogin(username,password);
		if(list.size()>0){
			Map<String,Object> maps = new HashMap<String,Object>();
			maps = (Map<String,Object>)list.get(0);
			sessionUtil.setLoginSession(request, maps);
			return new ModelAndView("index", maps);
		}
		return new ModelAndView("login", new HashMap<String,Object>());
		
	}
}
