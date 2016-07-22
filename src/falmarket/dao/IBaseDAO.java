package falmarket.dao;

import java.util.List;
import java.util.Map;

public interface IBaseDAO {
	public List<Map<String, Object>> getQueryResultToMap(String sql);
}
