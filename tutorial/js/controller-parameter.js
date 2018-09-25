	$(function() {
		// 목차 준비
		(function() {
			var $btn = $("#btn-index");
			var itemList = {};
			var uid = 1;
			var html = "";
			
			$("#content").find("ol, ul").each(function(i, el) {
				$(el).prop("id", "item-" + uid++);
				$(el).find("li").each(function(j, item) {
					var id = "item" + uid++;
					itemList[id] = item.textContent.split("\n")[0];
					$(item).prop("id", id);
					$(item).addClass("item-li");
				});
			});
			
			for(var item in itemList) {
				html += "<li><a href='#" + item + "'>" + itemList[item] + "</a></li>";
			}
			
			$("#index-container ul")
				.append(html)
				.hide()
				.on("click", "li", "click", function(e) {
					$("#index-container ul").hide();
				});
			
			$btn.on("click", function(e) {
				$("#index-container ul").show();
			});
		})();
		
		
		
		// 4. get ajax 방식(url)
		$("#getAjax").on("click", function(e) {
			var url = "../../tut/getAjax.do";
			$.getJSON(
				url,
				{
					p1: "v1",
					p2: "v2"
				},
				function(resp) {
					console.table(resp);
				}
			);
		});
		
		// 5. post ajax 방식(form) 
		$("#post-ajax-submit").on("click", function(e) {
			e.preventDefault();
			
			
			debugger;
			var url = "../../tut/postAjax.do";
			var form = $("form[name=post-form]");
			var formData = new FormData(form[0]);
			
		    $.ajax({
		        url: url,
		        data: form.serialize(),
		        type: 'POST',
		        success: function (resp) {
		        	console.table(resp);
		        }
		    });
		});
		
		// 6. post ajax 방식(form fileupload) 
		$("#post-file-ajax-submit").on("click", function(e) {
			e.preventDefault();
			
			debugger;
			var url = "../../tut/postFileAjax.do";
			var form = $("form[name=post-file-form]")[0];
			var formData = new FormData(form);
			
		    $.ajax({
		        url: url,
	            data: formData,
	            type: "POST",
	            enctype: 'multipart/form-data',
	            processData: false,
	            contentType: false,
		        success: function (resp) {
		        	console.table(resp);
		        }
		    });
		});
		
		///////////  json
		$("#btn-postJson").on("click", function(e) {
			
			debugger;
			var url = "../../tut/postJson.do";
			var data = {
				"p1": "v1",
				"p2": "v2"
			};
			
			$.postJSON(url, data, function(resp) {
				console.table(resp);
			});
		});
		
		$("#btn-postJsonVO").on("click", function(e) {
			var url = "../../tut/postJsonVO.do";
			var studentA = {
					name: "Hong jildong",
					age: 18,
					grade: "A",
					favorites: ["apple", "축구"]
			}
			
			$.postJSON(url, studentA, function(resp) {
				console.table(resp);
			});
		});
	}); 			
