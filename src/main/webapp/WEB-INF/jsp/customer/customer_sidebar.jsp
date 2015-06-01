<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp" %>


<div class="col-sm-3 col-md-2 sidebar">
	
	<ul class="nav nav-sidebar">
		<li class="${page == 'customer' ? 'active' : ''}" ><a href="#">Overview <span class="sr-only">(current)</span></a></li>
		<li class="${page == 'customers_search_first' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchByFirstName" />'>Search By First Name</a></li>
		<li class="${page == 'customers_search_last' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchByLastName" />'>Search by Last Name</a></li>
		<li class="${page == 'customers_search_DL' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchByDL" />'>Search by DL</a></li>
		<li class="${page == 'customers_search_mobileNumber' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchByMobileNumber" />'>Search by Mobile Number</a></li>
		<li class="${page == 'customers_search_vehicle' ? 'active' : ''}"><a href='<spring:url value="/service/customer/searchByVehicle" />'>Search by Vehicle</a></li>
	</ul>
	
	<ul class="nav nav-sidebar">
		<li class="${page == 'customer_add' ? 'active' : ''}"><a href='<spring:url value="/service/customer/addCustomer" />'>Add Customer</a></li>
		<li class="${page == 'customer_update' ? 'active' : ''}" ><a href="">Update Customer</a></li>
		<li class="${page == 'customer_remove' ? 'active' : ''}" ><a href="">Remove Customer</a></li>
		<li class="${page == 'customer_show' ? 'active' : ''}" ><a href='<spring:url value="/service/customer/showAllCustomer" />'>Show All Customers</a></li>		
	</ul>
		
</div>