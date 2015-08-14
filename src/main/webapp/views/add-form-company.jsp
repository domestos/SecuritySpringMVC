
<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<!-- / begin container -->
<div class="container">

	<div class="jumbotron">
		<h2>Форма реєстрації</h2>
		<br>

		<form role="form" class="form-horizontal" action="insertCompany" method="POST"  accept-charset="UTF-8">
			<div class="form-group form-group-lg">
				<label class="col-sm-2 control-label" for="formGroupInputLarge">
					Назва </label>
				<div class="col-sm-10">
					<input class="form-control" type="text" id="formGroupInputLarge"
						name="name" placeholder="Назва фірми">
				</div>
			</div>
			<div class="form-group form-group-sm">
				<label class="col-sm-2 control-label" for="formGroupInputSmall">
					Мобільний</label>
				<div class="col-sm-3">
					<input class="form-control" type="text" id="formGroupInputSmall"
					name="phone"	placeholder="+380(xx) xx-xx-xxx">
				</div>
			</div>
			<div class="form-group form-group-sm">
				<label class="col-sm-2 control-label" for="formGroupInputSmall">
					Email</label>
				<div class="col-sm-3">
					<input class="form-control" type="email" id="formGroupInputSmall"
					name="email"	placeholder="em@il">
				</div>
			</div>
			<p class="text-right">
				<button type="submit" class="btn btn-default btn-lg">Добавити</button>
			</p>
		</form>
		
		</div>
	</div>
	<!-- /container -->