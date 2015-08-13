
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ page import="java.util.List"%>
<%@ page import="com.spring.domain.Company"%>
	
	<div class="container">
	<h1>View all companes  </h1>
	
		<table>
	<thead>
		<tr>
			<th>Name Company  </th>
			<th> email  </th>
			<th> phone  </th>
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
	
	
	<tbody>
			<jstl:if test="${listCompany.size() < 3 }">
				TRUE
			</jstl:if>
			<jstl:out value="${listCompany}"/>
			<jstl:forEach items="${listCompany}" var="company">
				<tr>
					<td>${company.name}</td>
					<td>${company.age}</td>
				</tr>
			</jstl:forEach>
		</tbody>
</table>
		
		
			
		
		
		
		
		
		</div>
		
		
		
		
		
		
		<!-- /container -->

