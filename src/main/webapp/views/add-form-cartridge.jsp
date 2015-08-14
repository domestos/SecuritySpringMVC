
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page import="java.util.List"%>
<%@ page import="com.spring.domain.Company"%>
<%@ page import="com.spring.domain.Cartridge"%>
	<div class="container">
		<div class="jumbotron">
			<h2>Додати картрідж у базу</h2>
			<br>

			<form class="form-horizontal">
				<div class="form-group form-group-lg">
					<label class="col-sm-2 control-label" for="formGroupInputLarge">
						Фірма </label>
					<div class="col-sm-10">
					<select name="companyId" class="form-control input-lg">
					<option> </option>
					<jstl:forEach items="${listCompany}" var="company">
								<option value="${company.id}">${company.nameCompany}</option>
					</jstl:forEach>
									
					</select>
						
					</div>
				</div>
				<div class="form-group form-group-sm">
					<label class="col-sm-2 control-label" for="formGroupInputSmall">
						Модель </label>
					<div class="col-sm-3">
						<input class="form-control" type="text" id="formGroupInputSmall"
							placeholder="samsung SCX-4600">
					</div>
				</div>
				<div class="form-group form-group-sm">
					<label class="col-sm-2 control-label" for="formGroupInputSmall">
						ID number</label>
					<div class="col-sm-3">
						<input id="disabledInput" class="form-control" type="text" id="formGroupInputSmall"
							placeholder="id number" disabled>
					</div>
				</div>
				
				<div class="form-group form-group-sm">
					<label class="col-sm-2 control-label" for="formGroupInputSmall">
						RQ Link</label>
					<div class="col-sm-3">
						<input class="form-control" id="disabledInput" type="text" id="formGroupInputSmall"
							placeholder="автогенерація RQ code" disabled>
					</div>
					
				</div>
				<p class="text-right"><button type="submit" class="btn btn-default btn-lg" >Добавити</button></p>
				
			
			</form>
</div>	
		<!-- /container -->

