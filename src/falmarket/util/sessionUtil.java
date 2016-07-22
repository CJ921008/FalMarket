package falmarket.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class sessionUtil {
	private final static String  SESSIONUSERID = "SESSIONUSERID";
	private final static String  SESSIONUSERNAME = "SESSIONUSERNAME";
	private final static String  SESSIONLEVEL = "SESSIONLEVEL";
	public static void setLoginSession(HttpServletRequest request,Map<String,Object> map){
		HttpSession session = request.getSession();
		if(!map.isEmpty()){
			String userid = (String)map.get("USERID");
			String username = (String)map.get("USERNAME");
			String level = (String)map.get("LEVEL");
			
			session.setAttribute(SESSIONUSERID, userid);
			session.setAttribute(SESSIONUSERNAME, username);
			session.setAttribute(SESSIONLEVEL, level);
			
		}
	}
	public static String getUsername(HttpSession session){
		String username =  session.getAttribute(SESSIONUSERNAME)==null?"":(String)session.getAttribute(SESSIONUSERNAME);
		return username;
		
	}
	public static String getUserid(HttpSession session){
		String userid =  session.getAttribute(SESSIONUSERID)==null?"":(String)session.getAttribute(SESSIONUSERID);
		return userid;
		
	}
	public static String getUserlevel(HttpSession session){
		String level =  session.getAttribute(SESSIONLEVEL)==null?"":(String)session.getAttribute(SESSIONLEVEL);
		return level;
		
	}
}
