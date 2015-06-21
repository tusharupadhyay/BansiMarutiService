<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../../layouts/taglibs.jsp"%>
<%@ include file="../../layouts/jqWidgetsLibs.jsp"%>

<script type="text/javascript"
	src="<c:url value="/resources/scripts/customer/search_all_customer.js" />"></script>


<script type="text/javascript">
	$(document).ready(function() {
		
		var customers = jQuery.parseJSON('${customers}');		
    	initialize(customers);    	   	
	});
</script>


<h1 class="page-header">All Customers</h1>

<div class="row">
	
	<div id="table"></div>			

</div>



