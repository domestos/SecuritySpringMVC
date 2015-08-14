
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.spring.domain.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ page import="com.spring.domain.Cartridge"%>
<!-- / begin container -->


<div class="jumbotron">
<h2> --- View all cartridges ---</h2>
</div>

<div class="col-xs-12 .col-md-8">

	<table>
		<thead>
			<tr>
				<th>type |</th>
				<th>number Link |</th>
				<th>rq link |</th>
			</tr>
		</thead>
		<tbody>

			<jstl:forEach items="${cartridges}" var="cartridge">
				<tr>
					<td>${cartridge.typeCartridge}</td>
					<td>${cartridge.numberLink}</td>
					<td>${cartridge.rqLink}</td>

				</tr>
			</jstl:forEach>
		</tbody>
	</table>
	

</div>
<!-- /container -->


