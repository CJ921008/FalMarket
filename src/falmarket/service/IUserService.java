package falmarket.service;

import java.util.List;
import java.util.Map;

public interface IUserService {

	public List<Map<String,Object>> getUserByLogin(String username, String password);

}
