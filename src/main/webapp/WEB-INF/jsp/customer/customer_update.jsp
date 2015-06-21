<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layouts/taglibs.jsp"%>

<script type="text/javascript"
	src="<c:url value="/resources/scripts/customer/customer_update.js" />"></script>

<script type="text/javascript">
	$(document).ready(function() {
		
		var customer = jQuery.parseJSON('${customer}');						
		var dateFormat = '${date_format}';
		$('#datePick').datepicker({
			format : 'dd/mm/yyyy',
			startDate : "09/09/1989",
			endDate : dateFormat
		});
		
		initialize(customer);
	});
	
	
	
</script>

<style>
.my-error-class {
	color: #FF0000; /* red */
}

.my-valid-class {
	color: #00CC00; /* green */
}
</style>

<h1 class="page-header">Update Customer</h1>

<br>

<div id="alertMessage" class="col-lg-8 col-md-offset-2">
</div>


<div class="row placeholders">

	<form id="customer_edit" class="form-horizontal" novalidate="novalidate" action="">
		
		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group" align="center">
				<label for="customer_id" class="col-sm-3 control-label">Customer ID:</label>
				<div class="col-sm-6">
					<input id="customer_id" class="form-control input-sm" readonly/>
				</div>
			</div>

		</div>
		
		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group" align="center">
				<label for="firstName" class="col-sm-3 control-label">First
					Name:</label>
				<div class="col-sm-6">
					<input id="firstName" name="firstName" minlength="2" class="form-control input-sm required" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="middleName" class="col-sm-3 control-label">Middle
					Name:</label>
				<div class="col-sm-6">
					<input id="middleName" name="middleName" class="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="lastName" class="col-sm-3 control-label">Last
					Name:</label>
				<div class="col-sm-6">
					<input id="lastName" name="lastName" minlength="2" class="form-control input-sm required" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="sex" class="col-sm-3 control-label">Gender:</label>
				<div class="col-sm-6">
					<select id="sex" name="sex" class="form-control input-sm required">
						<option>Male</option>
						<option>Female</option>						
					</select>
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="Date Of Birth" class="col-sm-3 control-label">Date
					Of Birth:</label>

				<div class="input-append col-sm-6 date" id="datePick">
					<input type="text" id="dateOfBirth" name="dateOfBirth"
						class="form-control input-sm required" />
					<span class="add-on"><i class="icon-th"></i></span>
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="homeNumber" class="col-sm-3 control-label">Home
					Phone No:</label>
				<div class="col-sm-6">
					<input id="homeNumber" name="homeNumber" minlength="6" type="number" class="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="mobileNumber" class="col-sm-3 control-label">Mobile
					No:</label>
				<div class="col-sm-6">
					<input id="mobileNumber" name="mobileNumber" minlength="10" type="number" class="form-control input-sm required" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="emailId" class="col-sm-3 control-label">Email:</label>
				<div class="col-sm-6">
					<input id="emailId" name="emailId" class="form-control input-sm" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="drivingLicense" class="col-sm-3 control-label">Driving
					License No:</label>
				<div class="col-sm-6">
					<input id="drivingLicense" name="drivingLicense" class="form-control input-sm required" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="vehicle" class="col-sm-3 control-label">Vehicle:</label>
				<div class="col-sm-6">
					<input id="vehicle" name="vehicle" class="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="address_line1" class="col-sm-3 control-label">Address:</label>
				<div class="col-sm-6">
					<input id="address_line1" name="address_line1" minlength="10" class="form-control input-sm required" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="address_line" class="col-sm-3 control-label">Address
					(Optional):</label>
				<div class="col-sm-6">
					<input id="address_line2" name="address_line2" class="form-control input-sm" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="city" class="col-sm-3 control-label">City :</label>
				<div class="col-sm-6">
					<input id="city" name="city" class="form-control input-sm required" />
				</div>
			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="district" class="col-sm-3 control-label">District:</label>
				<div class="col-sm-6">
					<input id="district" name="district" class="form-control input-sm required" />
				</div>
			</div>

		</div>


		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<label for="state" class="col-sm-3 control-label">State:</label>

				<div class="col-sm-6">
					<select id="state" name="state" class="form-control input-sm required">
						<option>Gujrat</option>
						<option>Jammu And Kashmir</option>
					</select>
				</div>

			</div>

		</div>

		<div class="col-sm-9 col-md-offset-1">

			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-6">
					<input id="updateButton" type="submit" class="btn btn-info btn-lg" value="Update Customer" />
				</div>
			</div>

		</div>

	</form>

</div>

