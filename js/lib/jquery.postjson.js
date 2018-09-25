/*************************************************
* Function: $.postJSON ( url, jsonObject, success, options )
*    url:           The url to post the json object to
*    jsonObject:    The JSON object to post
*    success:       The success handler to invoke on successful submission
*    options:       Additional options to provide to the AJAX call. This is the exact same object you would use when calling $.ajax directly.
*
* Description:
* $.postJSON simplifies posting JSON objects to any url by invoking $.ajax with the required options. The specified JSON object will be stringified and posted to the url.
* It's up to the server to deserialize the stringified JSON object. ASP.NET MVC 3 will do this automatically
*
* Sample usage:
* var onSuccess = function() { ... };
* var onError = function() { ... };
* $.postJSON ( '/account/login', { username: 'jack', password: 'secretPass' }, onSuccess, { error: onError } );
**************************************************/

(function($) {
	$.postJSON = function(url, data, success, dataType) {
		if (typeof data != 'string') {
			data = JSON.stringify(data);
		}
		$.ajax({
			url : url,
			type: "post",
			data: data,
			dataType: dataType || "json",
			contentType: "application/json",
			success: success
		});
	}
})(jQuery);