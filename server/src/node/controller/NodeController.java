package node.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import node.service.NodeService;

@Controller
public class NodeController {
	@Autowired
	private NodeService nodeService;

	@RequestMapping(value = "/menu")
	public String nodeMenu(){
		return "menu";
	}

	@RequestMapping(value = "/getChildNodeList", method = RequestMethod.GET)
	@ResponseBody
	public List<Map> getChildNodeList(String id) {
		return nodeService.getChildNodeList(id);
	}

}
