<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../../layouts/taglibs.jsp"%>
<%@ include file="../../layouts/jqWidgetsLibs.jsp"%>

<script type="text/javascript"
	src="<c:url value="/resources/scripts/customer/search_customer.js" />"></script>
	<script type="text/javascript"
	src="<c:url value="/resources/scripts/bootbox.min.js" />"></script>		
	
<style>
.my-error-class {
	color: #FF0000; /* red */
}

.my-valid-class {
	color: #00CC00; /* green */
}

</style>	

<h1 class="page-header">Search Customer</h1>

<div id="main" class="row">

	<div class="col-lg-11 col-md-offset-2">

		<form id="searchField" class="form-inline" novalidate="novalidate"
			action="">

			<div class="form-group">
				<div class="input-group">
					<span class="input-group-btn"> <select
						id="searchByParameter" name="searchByParameter"
						class="form-control" aria-haspopup="true" aria-expanded="false">
							<option value="1">First Name</option>
							<option value="2">Last Name</option>
							<option value="3">Driving License</option>
							<option value="4">Mobile Number</option>
							<option value="5">Vehicle</option>
					</select>

					</span> <input id="searchInput" name="searchInput" type="text"
						class="form-control" placeholder="Search for..."
						aria-haspopup="true" aria-expanded="false"> <span
						class="input-group-btn">
						<button type="submit" class="btn btn-primary" id="search">Search</button>
					</span>
				</div>
			</div>
		</form>

	</div>

	<br /> <br />

	<div id="alertMessage" class="col-lg-8 col-md-offset-2"></div>

	<br />

	<div id="table"></div>

	<div id="modal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Customer Detail</h4>
				</div>
				<div class="modal-body">
					
					<div class="form-horizontal">
						
						<div class="form-group">
							<label for="customer_id" class="col-sm-3 control-label">Customer ID:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="customer_id"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="firstName" class="col-sm-3 control-label">First
								Name:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="firstName"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="middleName" class="col-sm-3 control-label">Middle
								Name:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="middleName"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="lastName" class="col-sm-3 control-label">Last Name:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="lastName"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="sex" class="col-sm-3 control-label">Gender:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="sex"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="dateOfBirth" class="col-sm-3 control-label">Date Of Birth:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="dateOfBirth"
									disabled>
							</div>
						</div>
									
						
						<div class="form-group">
							<label for="homeNumber" class="col-sm-3 control-label">Home Phone:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="homeNumber"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="mobileNumber" class="col-sm-3 control-label">Mobile Phone:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="mobileNumber"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="emailId" class="col-sm-3 control-label">Email:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="emailId"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="drivingLicense" class="col-sm-3 control-label">Driving License:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="drivingLicense"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="vehicle" class="col-sm-3 control-label">Vehicle:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="vehicle"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="address_line1" class="col-sm-3 control-label">Address:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="address_line1"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="address_line2" class="col-sm-3 control-label">Address (Optional):</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="address_line2"
									disabled>
							</div>
						</div>
												
						<div class="form-group">
							<label for="city" class="col-sm-3 control-label">City:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="city"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="district" class="col-sm-3 control-label">District:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="district"
									disabled>
							</div>
						</div>
						
						<div class="form-group">
							<label for="state" class="col-sm-3 control-label">State:</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="state"
									disabled>
							</div>
						</div>
						

					</div>
										
				</div>
				<div class="modal-footer">
					<a href='<spring:url value="/service/customer/addCustomer" />' class="btn btn-info col-md-3">Add New</a>					
					<button id="updateButton" type="button" class="btn btn-info col-md-3">Update</button>
					<button id="removeButton" type="button" class="btn btn-info col-md-3">Remove</button>										
					<button type="button" class="btn btn-info col-md-2" data-dismiss="modal">Close</button>					
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->



</div>


<script type="text/javascript">
	$('dcoument').ready(function(){		
		
		//initialize();	
	});
</script>



