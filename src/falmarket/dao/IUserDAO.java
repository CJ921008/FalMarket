package falmarket.dao;

import java.util.List;
import java.util.Map;

public interface IUserDAO {

	public List<Map<String,Object>> getUserByLogin(String username, String password);

}
