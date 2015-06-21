
function initialize(customer){
		
	$('#alertMessage').hide();
	enterCustomerDetail(customer);
	(function($, W, D) {
		var JQUERY4U = {};

		JQUERY4U.UTIL = {
			setupFormValidation : function() {
				//form validation rules
				$("#customer_edit")
						.validate(
								{
									rules : {
										firstName : "required",
										lastName : "required",
										emailId : {										
											email : true
										},
										mobileNumber : "required",
										sex : "required",
										address_line1 : "required",									
										city : "required",
										district : "required",
										state : "required",
										dateOfBirth : "required"
									},
									messages : {
										firstName : "Please enter your first name",
										lastName : "Please enter your last name",									
										email : "Please enter a valid email address",
										mobileNumber : "Please enter mobile number",
										sex : "Please select gender",
										address_line1 : "Please add address",									
										city : "Please add city",
										district : "Please add district",
										state : "Please select a state",
										dateOfBirth : "Please select your date of birth"
									},
									errorClass: "my-error-class",								
									submitHandler : function(form) {
										saveCustomerUpdatedInfo();
										//form.submit();
									}
								});
			}
		}

		//when the dom has loaded setup form validation rules
		$(D).ready(function($) {
			JQUERY4U.UTIL.setupFormValidation();
		});

	})(jQuery, window, document);

	$('#alertMessage').on('close.bs.alert', function () {
		window.location.href = "/service/customer/searchBy"; 
	});
}

function saveCustomerUpdatedInfo(){
	var rowData = {
    		id : $("#customer_id").val(),
    		firstName: $("#firstName").val(), middleName: $("#middleName").val(),
    		lastName: $("#lastName").val(), drivingLicense: $("#drivingLicense").val(),
    		vehicle: $("#vehicle").val(), emailId: $("#emailId").val(),
    		sex: $("#sex").val(), address_line1: $("#address_line1").val(),
    		address_line2: $("#address_line2").val(), city: $("#city").val(),
    		district: $("#district").val(), state: $("#state").val(),
    		homeNumber: $("#homeNumber").val(), mobileNumber: $("#mobileNumber").val(),
    		dateOfBirth: $("#dateOfBirth").val()
    };
    
                           
    $.ajax({
	url : "/service/customer/updateCustomer/update",
	type : 'POST',
	data : (  { updateData : JSON.stringify(rowData) }  ),
	success : function(data) {        					
		createAlert(data);
		$("#customer_edit").remove();		
		
	},
	error : function(data) {
		console.log("Error : " + data); 
		createAlert(data);
		}				
	});
}

function createAlert(response) {
	var responseMessage;
	var alert
	if(response == 'Success'){
		responseMessage = "Customer Updated Successfully!";
		alert = "<div id=\"message\" class=\"alert alert-success alert-dismissible fade in\" style=\"text-align: center;\">";
	}
	else {
		responseMessage = "Some error happened during updating customer!";
		alert = "<div id=\"message\" class=\"alert alert-danger alert-dismissible fade in\" style=\"text-align: center;\">";
	}	
	alert = alert + "<button type=\"button\" class=\"close\" data-dismiss=\"alert\"> \n";
		alert = alert + "<span aria-hidden=\"true\">&times;</span> \n";
		alert = alert + "<span class=\"sr-only\">Close</span> \n";
		alert = alert + "</button> \n";
		alert = alert + "<h4> \n";
		alert = alert + responseMessage + "</h4>";
		alert = alert + "</div>";
	  
	  console.log("Adding message: " + alert);
	  $('#alertMessage').append(alert);
	  			  
	  $('#alertMessage').show();
}

function enterCustomerDetail(customer) {
	$('#customer_id').val(customer.id);
	$('#firstName').val(customer.firstName);
	$("#middleName").val(customer.middleName);
	$("#lastName").val(customer.lastName);
	$("#drivingLicense").val(customer.drivingLicense);
	$("#vehicle").val(customer.vehicle);
	$("#emailId").val(customer.emailId);
	$("#sex").val(customer.sex);
	$("#address_line1").val(customer.address_line1);
	$("#address_line2").val(customer.address_line2);
	$("#city").val(customer.city);
	$("#district").val(customer.district);
	$("#state").val(customer.state);
	$("#homeNumber").val(customer.homeNumber);
	$("#mobileNumber").val(customer.mobileNumber);
	$("#dateOfBirth").val(customer.dateOfBirth);
}
