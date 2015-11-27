<%@tag language="java" pageEncoding="ISO-8859-1" description="Template"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Home</title>
	<link rel="stylesheet" href="/resources/css/960.css" type="text/css"
		media="screen" charset="utf-8" />
	<link rel="stylesheet" href="/resources/css/template.css"
		type="text/css" media="screen" charset="utf-8" />
	<link rel="stylesheet" href="/resources/css/colour.css" type="text/css"
		media="screen" charset="utf-8" />
</head>
<body>
	<jsp:invoke fragment="header" />
	<div id="body">
		<jsp:doBody />
	</div>
	<div id="pagefooter">
		<jsp:invoke fragment="footer" />
	</div>
</body>
</html>