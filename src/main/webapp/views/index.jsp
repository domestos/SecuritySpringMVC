

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">


<!-- Bootstrap core CSS -->

<link rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap.css" />'>

<!-- Bootstrap CSS mini -->
<link rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap.min.css" />'>

<!-- Optional theme -->
<link rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>'>

<!-- Latest compiled and minified JavaScript -->
<script src='<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>'></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body>
	<P>The time on the server is ${serverTime}.</P>
<body>


	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Support Cartridge</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="#">Головна</a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Мої дії <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="dropdown-header">Add (admin preferences)</li>
						<li><a href="formCompany">Додати компанію</a></li>
						<li><a href="formCartridge">Додати картрідж</a></li>
						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Views</li>
						<li><a href="#">Список компаній</a></li>
						<li><a href="#">Список картріджів</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input placeholder="Email" class="form-control" type="text">
					</div>
					<div class="form-group">
						<input placeholder="Password" class="form-control" type="password">
					</div>
					<button type="submit" class="btn">Sign in</button>
				</form>

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>


	<div class="container">

		<div class="jumbotron">
			<h1>Заправка картріджів</h1>
			<p>Ми заправимо, почистимо і поремонтуємо у разі необхідності:)</p>
			<p>Коли все буде готово ми Вам зателефонуємо...</p>
			<p>
		</div>
		<img class="img-responsive" align="center" alt="support cartridge"
			src='<c:url value="/resources/images/supportcartridge.jpg"/>'>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src='<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"/>'></script>
	<script src='<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>'></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src='<c:url value="/resources/bootstrap//js/ie10-viewport-bug-workaround.js"/>'></script>


</body>
</html>