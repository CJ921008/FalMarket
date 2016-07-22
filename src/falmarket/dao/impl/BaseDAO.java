package falmarket.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import falmarket.dao.IBaseDAO;
@Repository(value="flyshop")
public class BaseDAO implements IBaseDAO {

	@Resource
	private SessionFactory sessionfactory;
	public void SetSessionFactory(SessionFactory sessionfactory){
		this.sessionfactory = sessionfactory;
	}
	
	public Session getSession(){
		return sessionfactory.openSession();
	}
	@Override
	public List<Map<String, Object>> getQueryResultToMap(String sql) {
		SQLQuery query = getSession().createSQLQuery(sql);
		return (List<Map<String,Object>>)query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	}

}
