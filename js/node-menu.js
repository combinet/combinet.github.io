$(function() {
	$('#node-menu-div').jstree({
		plugins : [ "wholerow", "checkbox", "state" ],
		core: {
			"multiple" : true,
			data: {
				url: "./getChildNodeList.do",
				data: function(node) {
					var id = node.id === "#" ? 'GD0000001' : node.id;
					return {id: id};
				},
				success: function(resp) {
					resp.forEach(function(item) {
						item.children = true;
					});
				}
			}
		},
		checkbox: {
			undetermined: true,
			"keep_selected_style" : false
		}
	});
});


