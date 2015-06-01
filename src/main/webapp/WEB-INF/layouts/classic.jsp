\<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="taglibs.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript"
	src="<c:url value="/resources/scripts/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/scripts/bootstrap.js" />"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap-theme.min.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/dashboard.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/sticky-footer.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/font-awesome.min.css" />">	
<script type="text/javascript"
	src="<c:url value="/resources/scripts/jquery.dataTables.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/scripts/dataTables.responsive.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/scripts/dataTables.bootstrap.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/scripts/bootstrap-datepicker.min.js" />"></script>			
	
<link rel="stylesheet"
	href="<c:url value="/resources/css/dataTables.bootstrap.css" />">	
				

<title><tiles:getAsString name="title" /></title>

</head>
<body>	
			
	<tiles:insertAttribute name="header" />

	<div class="container-fluid">
	
		<div class="row">
			<tiles:insertAttribute name="sidebar" />
			
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<tiles:insertAttribute name="body" />		
			</div>		
				
		</div>
	</div>
	
	<!-- Footer using bootstrap templates -->
	<footer class="footer">
      <div class="container">
        <tiles:insertAttribute name="footer" />
      </div>
    </footer>	

</body>
</html>