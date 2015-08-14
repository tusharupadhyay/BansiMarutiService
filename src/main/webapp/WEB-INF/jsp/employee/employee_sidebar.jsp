<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp" %>

<div class="col-sm-3 col-md-2 sidebar">
	
	<ul class="nav nav-sidebar">
		<li class="${page == 'employee_search' ? 'active' : ''}"><a href='<spring:url value="/service/employee/searchBy" />'>Search Employee</a></li>
		<li class="${page == 'employee_add' ? 'active' : ''}"><a href='<spring:url value="/service/employee/addEmployee" />'>Add Employee</a></li>
		<li class="${page == 'employee_show' ? 'active' : ''}" ><a href='<spring:url value="/service/employee/showAllEmployees" />'>Show All Employee</a></li>
	</ul>
			
</div>