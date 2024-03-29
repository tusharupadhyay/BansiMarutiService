<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp"%>
<%@ include file="../../layouts/jqWidgetsLibs.jsp"%>

<script type="text/javascript"
	src="<c:url value="/resources/scripts/customer/formValidation.js" />"></script>


<script type="text/javascript">
	$(document).ready(function(){
		var dateFormat = '${date_format}';

		$('#dateOfBirth').datepicker({
			format : 'dd/mm/yyyy',
			startDate : "09/09/1989",
			endDate : dateFormat
		});		
	});
</script>

<style>

.my-error-class {
    color:#FF0000;  /* red */
}
.my-valid-class {
    color:#00CC00; /* green */
}

</style>

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

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group" align="center">
				<label for="firstName" class="col-sm-3 control-label">First
					Name:</label>
				<div class="col-sm-6">
					<form:input path="firstName" minlength="2" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="middleName" class="col-sm-3 control-label">Middle
					Name:</label>
				<div class="col-sm-6">
					<form:input path="middleName" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="lastName" class="col-sm-3 control-label">Last
					Name:</label>
				<div class="col-sm-6">
					<form:input path="lastName" minlength="2" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="sex" class="col-sm-3 control-label">Gender:</label>
				<div class="col-sm-6">
					<form:select path="sex" cssClass="form-control input-sm">
						<form:option value="Male" label="Male" />
						<form:option value="Female" label="Female" />
						<form:option value="Not Known" label="Not Known" />
					</form:select>
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="dateOfBirth" class="col-sm-3 control-label">Date Of Birth:</label>
															
				<div class="input-append col-sm-6">
					<form:input id="dateOfBirth" type="text" path="dateOfBirth"
						cssClass="form-control input-sm" />					
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="homeNumber" class="col-sm-3 control-label">Home
					Phone No:</label>
				<div class="col-sm-6">
					<form:input path="homeNumber" type="number" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="mobileNumber" class="col-sm-3 control-label">Mobile
					No:</label>
				<div class="col-sm-6">
					<form:input path="mobileNumber" minlength="10" type="number" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="emailId" class="col-sm-3 control-label">Email:</label>
				<div class="col-sm-6">
					<form:input path="emailId" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="drivingLicense" class="col-sm-3 control-label">Driving
					License No:</label>
				<div class="col-sm-6">
					<form:input path="drivingLicense" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="vehicle" class="col-sm-3 control-label">Vehicle:</label>
				<div class="col-sm-6">
					<form:input path="vehicle" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="address_line1" class="col-sm-3 control-label">Address:</label>
				<div class="col-sm-6">
					<form:input path="address_line1" minlength="6" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="address_line" class="col-sm-3 control-label">Address (Optional):</label>
				<div class="col-sm-6">
					<form:input path="address_line2" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="city" class="col-sm-3 control-label">City :</label>
				<div class="col-sm-6">
					<form:input path="city" cssClass="form-control" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="district" class="col-sm-3 control-label">District:</label>
				<div class="col-sm-6">
					<form:input path="district" cssClass="form-control input-sm" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="state" class="col-sm-3 control-label">State:</label>

				<div class="col-sm-6">
					<form:select path="state" cssClass="form-control">
						<form:option value="Jammu And Kashmir" label="Jammu And Kashmir" />
						<form:option value="Gujrat" label="Gujrat" />
					</form:select>
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-6">
					<input type="submit" class="btn btn-info btn-lg" value="Add Customer" />
				</div>
			</div>

		</div>

	</form:form>

</div>


