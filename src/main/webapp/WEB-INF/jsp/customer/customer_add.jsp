<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp"%>

<script type="text/javascript">
	$(document).ready(function(){
		var dateFormat = '${date_format}';
		
		$('#datePick').datepicker({
   		 format: 'dd/mm/yyyy',
   	    startDate: "09/09/1989",
   	    endDate: dateFormat
   	});
	});

</script>



<h1 class="page-header">Add Customers</h1>

<br>

<c:if test="${param.success eq true}">
	<div class="row placeholders">
		<div class="col-md-6 col-md-offset-2 alert alert-success"
			align="center">Customer added successfully!</div>
	</div>

	<br>

</c:if>


<div class="row placeholders">


	<form:form commandName="customer" cssClass="form-horizontal">

		<div class="form-group">
			<label for="firstName" class="col-sm-2 control-label">First
				Name:</label>
			<div class="col-sm-6">
				<form:input path="firstName" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="middleName" class="col-sm-2 control-label">Middle
				Name:</label>
			<div class="col-sm-6">
				<form:input path="middleName" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="lastName" class="col-sm-2 control-label">Last
				Name:</label>
			<div class="col-sm-6">
				<form:input path="lastName" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="drivingLicense" class="col-sm-2 control-label">Driving
				License:</label>
			<div class="col-sm-6">
				<form:input path="drivingLicense" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="emailId" class="col-sm-2 control-label">Email:</label>
			<div class="col-sm-6">
				<form:input path="emailId" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="vehicle" class="col-sm-2 control-label">Vehicle:</label>
			<div class="col-sm-6">
				<form:input path="vehicle" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="address_line1" class="col-sm-2 control-label">Address
				Line 1:</label>
			<div class="col-sm-6">
				<form:input path="address_line1" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="address_line" class="col-sm-2 control-label">Address
				Line 2:</label>
			<div class="col-sm-6">
				<form:input path="address_line2" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="city" class="col-sm-2 control-label">City :</label>
			<div class="col-sm-6">
				<form:input path="city" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="district" class="col-sm-2 control-label">District:</label>
			<div class="col-sm-6">
				<form:input path="district" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="state" class="col-sm-2 control-label">State:</label>
			<div class="col-sm-6">
				<form:input path="state" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="mobileNumber" class="col-sm-2 control-label">Mobile
				No:</label>
			<div class="col-sm-6">
				<form:input path="mobileNumber" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="homeNumber" class="col-sm-2 control-label">Home
				Phone No:</label>
			<div class="col-sm-6">
				<form:input path="homeNumber" cssClass="form-control" />
			</div>
		</div>

		<div class="form-group">
			<label for="Date Of Birth" class="col-sm-2 control-label">Date
				Of Birth:</label>

			<div class="input-append col-sm-6 date" id="datePick">
				<form:input type="text" path="dateOfBirth" cssClass="form-control" />
				<span class="add-on"><i class="icon-th"></i></span>
			</div>

		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-6">
				<input type="submit" class="btn btn-default" value="Submit" />
			</div>
		</div>

	</form:form>



</div>
