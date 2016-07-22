package falmarket.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import falmarket.dao.IUserDAO;

@Repository
public class UserDAO extends BaseDAO implements IUserDAO{

	@Override
	public List<Map<String,Object>> getUserByLogin(String username, String password) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT username AS USERNAME,userid AS USERID,level AS LEVEL FROM USERINFO WHERE username='"+username+"' ");
		sql.append(" AND password='"+password+"' ");
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = super.getQueryResultToMap(sql.toString());
		return list;
	}

}
