
(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			//form validation rules
			$("#customer")
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
								//validClass: "my-valid-class",								
								submitHandler : function(form) {									
									form.submit();
								}
							});
		}
	}

	//when the dom has loaded setup form validation rules
	$(D).ready(function($) {
		JQUERY4U.UTIL.setupFormValidation();
	});

})(jQuery, window, document);
