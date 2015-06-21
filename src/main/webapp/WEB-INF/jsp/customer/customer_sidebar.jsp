<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp" %>


<div class="col-sm-3 col-md-2 sidebar">
	
	<ul class="nav nav-sidebar">		
		<li class="${page == 'customers_search' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchBy" />'>Search Customer</a></li>
		<li class="${page == 'customer_add' ? 'active' : ''}"><a href='<spring:url value="/service/customer/addCustomer" />'>Add Customer</a></li>
		<li class="${page == 'customer_show' ? 'active' : ''}" ><a href='<spring:url value="/service/customer/showAllCustomer" />'>Show All Customers</a></li>
	</ul>
	
	<!-- <ul class="nav nav-sidebar">
				
	</ul> -->
		
</div>