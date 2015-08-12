<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
				<li><a href="/SecuritySpringMVC">Головна</a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Мої дії <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="dropdown-header">Add (admin preferences)</li>
						<li><a href="formCompany">Додати компанію</a></li>
						<li><a href="formCartridge">Додати картрідж</a></li>
						<li role="separator" class="divider"></li>
						<li class="dropdown-header">Views</li>
						<li><a href="showAllCompany">Список компаній</a></li>
						<li><a href="showAllCartridge">Список картріджів</a></li>
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
