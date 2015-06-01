<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp"%>

<%-- <link rel="stylesheet"
	href="<c:url value="/resources/css/dataTables.bootstrap.css" />">

<link rel="stylesheet"
	href="<c:url value="/resources/css/dataTables.bootstrap.css" />">		 --%>



<style>
body {
	font-size: 140%
}

table.dataTable th, table.dataTable td {
	white-space: nowrap;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {
    	$('#example').DataTable();
    	   	
	} );
</script>



<h1 class="page-header">Show Customers</h1>

<div class="row">


	<table id="example"
		class="table table-striped table-hover dt-responsive table-bordered"
		width="100%">
		<thead>
			<tr>
				<th>First name</th>
				<th>Last name</th>
				<th>DOB</th>
				<th>Email</th>
				<th>Driving License</th>
				<th>Vehicle</th>
			</tr>

		</thead>

		<tbody>

			<c:forEach var="customer" items="${customers}">

				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.dateOfBirth}</td>
					<td>${customer.emailId}</td>
					<td>${customer.drivingLicense}</td>
					<td>${customer.vehicle}</td>
				</tr>


			</c:forEach>

		</tbody>

	</table>

</div>



