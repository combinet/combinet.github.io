package node.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.dao.NodeDao;
import node.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService{

	@Autowired
	private NodeDao nodeDao;

	@Override
	public List<Map> getChildNodeList(String id) {
		return nodeDao.getChildNodeList(id);
	}

}
