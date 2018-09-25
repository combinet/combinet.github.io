package node.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import node.dao.NodeDao;

@Repository
public class NodeDaoImpl implements NodeDao {
	@Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Map> getChildNodeList(String id) {
		List<Map> result = sqlMapClientTemplate.queryForList(NAME_SPACE + "getChildNodeList", id);
		return result;
	}

}
