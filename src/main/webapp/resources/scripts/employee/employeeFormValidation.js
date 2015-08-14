/**
 * Employee Form validation
 */

(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			//form validation rules
			$("#employee")
					.validate(
							{
								rules : {
									firstName : "required",
									lastName : "required",
									emailId : {										
										email : true
									},
									contactNumber : "required",
									sex : "required",
									address : "required",									
									city : "required",
									district : "required",
									state : "required",
									dateOfBirth : "required",
									salary	: "required",
									designation : "required"
								},
								messages : {
									firstName : "Please enter your first name",
									lastName : "Please enter your last name",									
									email : "Please enter a valid email address",
									contactNumber : "Please enter any contact number",
									sex : "Please select gender",
									address : "Please add address",									
									city : "Please add city",
									district : "Please add district",
									state : "Please select a state",
									dateOfBirth : "Please select your date of birth",
									salary : "Please enter salary of employee",
									designation : "Please enter employee's designation"
								},
								errorClass: "my-error-class",														
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
