javascript:(function(){
	
	var v = "3.2.1";

	if (window.jQuery === undefined || window.jQuery.fn.jquery < v) {
		var script = document.createElement("script");
		script.src = "http://ajax.googleapis.com/ajax/libs/jquery/" + v + "/jquery.min.js";
		script.onload = init();
		document.getElementsByTagName("head")[0].appendChild(script);
	} else {
		init();
	}
	
	function init() {
		
		console.log("hiasdasd");
		
		console.log($("meta[name='author'").attr("content"));
		
		var text = document.body.innerText;
		
		var matches = text.match(/\b\S+\b/g);
		
		console.log(text);
		
	}
}())

PLOSE REGEX

\b\S+\b
\b\S+\b
\b\S+\b
\b\S+\b
