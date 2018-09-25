package node.dao;

import java.util.List;
import java.util.Map;

public interface NodeDao {

	String NAME_SPACE = "tbs.nodemenu.";

	List<Map> getChildNodeList(String id);
}


