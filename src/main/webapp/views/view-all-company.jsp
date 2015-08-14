
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page import="java.util.List"%>
<%@ page import="com.spring.domain.Company"%>
<%@ page import="com.spring.domain.Cartridge"%>

<div class="jumbotron">
<h2>View all companes</h2>
</div>
<div class="container">

	

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Name Company</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<jstl:forEach items="${listCompany}" var="company">
				<tr>
					<td>${company.nameCompany}</td>
					<td>${company.email}</td>
					<td>${company.phone}</td>

				</tr>
			</jstl:forEach>
		</tbody>
	</table>
</div>

<!-- /container -->

