package falmarket.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import falmarket.dao.IUserDAO;
import falmarket.service.IUserService;
@Service
public class UserService implements IUserService {

	@Resource
	private IUserDAO userdao;
	@Override
	public List<Map<String,Object>> getUserByLogin(String username, String password) {
		return userdao.getUserByLogin(username,password);
	}

}
