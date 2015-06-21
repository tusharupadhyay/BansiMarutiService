/**
 * 
 */

$('#alertMessage').hide();

(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			//form validation rules
			$("#searchField")
					.validate(
							{
								rules : {
									searchByParameter : "required",
									searchInput : "required",									
								},
								messages : {
									searchByParameter : "Please Enter value to search",
									searchInput : "Please select a search parameter from dropdown",									
								},
								errorClass: "my-error-class",															
								submitHandler : function(form) {
									
									doSearch();
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




/*function initialize(searchBy) {
	
	
	$("#searchField").submit(function( event ) {
		alert($('#searchByParameter').val());
		
		event.preventDefault();				  
	});
	
	
}*/

function doSearch() {
	
	//$('#search').click(function(){
	url = "/service/customer/searchBy/" + $('#searchByParameter').val() + "/" + $('#searchInput').val();
	
	$.ajax({
		url : url,
		type : 'POST',
		contentType : "application/json",
		mimeType : "application/json",
		success : function(data) {
			 if ( data.length == 0 ) {
				 $('#alertMessage').empty();
				 createAlert($('#searchInput').val());
				 $("#table").remove();
			    }
			 else{
				 $('#alertMessage').empty();
				 createDataTable(data);
			 }			
		},
		error : function(data) {
			alert("Error : " + data.status);
		}
	});	 
	
	//});
}


function createDataTable(data) {
	// Data table task
	
	$('#main').append("<div id=\"table\"></div>");
	
    var source =
    {
    		localData: data,
    	    dataFields: [
				{ name: 'id', type: 'int' },         
    	        { name: 'firstName', type: 'string' },
    	        { name: 'middleName', type: 'string' },
    	        { name: 'lastName', type: 'string' },
    	        { name: 'dateOfBirth', type: 'string' },
    	        { name: 'vehicle', type: 'string' },            	        
    	        { name: 'drivingLicense', type: 'string' },
    	        { name: 'emailId', type: 'string' },
    	        { name: 'sex', type: 'string' },
    	        { name: 'address_line1', type: 'string' },
    	        { name: 'address_line2', type: 'string' },
    	        { name: 'city', type: 'string' },
    	        { name: 'district', type: 'string' },
    	        { name: 'state', type: 'string' },
    	        { name: 'homeNumber', type: 'string' },
    	        { name: 'mobileNumber', type: 'string' }
    	    ],
    	    id: 'id'        
    };
    var dataAdapter = new $.jqx.dataAdapter(source, {
        loadComplete: function () {
            // data is loaded.                   
        }
    });
    $("#table").jqxDataTable(
    {
        width: '100%',
        source: dataAdapter,
        pageable: true,
        sortable: true,
        altRows: true,
        theme: 'energyblue',
        ready: function () {            
        },
        pagerButtonsCount: 8,
        columns: [
                  { text: 'First Name', dataField: 'firstName', width: '20%' },
                  { text: 'Last Name', dataField: 'lastName', width: '20%' },
                  { text: 'DOB', dataField: 'dateOfBirth', width: '10%' },
                  { text: 'Vehicle', dataField: 'vehicle', width: '20%' },
                  { text: 'City', dataField: 'city', width: '15%' },
                  { text: 'Driving License' ,dataField: 'drivingLicense' } 
              ]
    });
    $("#table").on('rowDoubleClick', function (event) {
        var args = event.args;
        var index = args.index;
        var row = args.row;
        
       $('#customer_id').val(row.id);
       $('#firstName').val(row.firstName);      
       $("#middleName").val(row.middleName);
       $("#lastName").val(row.lastName);
       $("#drivingLicense").val(row.drivingLicense);
       $("#vehicle").val(row.vehicle);
       $("#emailId").val(row.emailId);
       $("#sex").val(row.sex);
       $("#address_line1").val(row.address_line1);
       $("#address_line2").val(row.address_line2);
       $("#city").val(row.city);
       $("#district").val(row.district);
       $("#state").val(row.state);
       $("#homeNumber").val(row.homeNumber);
       $("#mobileNumber").val(row.mobileNumber);
       $("#dateOfBirth").val(row.dateOfBirth); 
       $('#modal').modal('toggle');
       $('#modal').modal('show');
        
    });

    $('#updateButton').click(function() {
    		
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
    	
    	window.location.href = "/service/customer/updateCustomer/" + $("#customer_id").val();    	
    	
    });
    
    $('#removeButton').click(function () {
    	bootbox.confirm("Are you sure about removing this customer?", function(result) {
    		  if(result == true) {
    			  removeCustomer();
    		  }
    		  
    		}); 
    });

}

function createAlert(searchInput) {
	
	var responseMessage = "No record found for " + searchInput;
	var alert = "<div id=\"message\" class=\"alert alert-danger alert-dismissible fade in\" style=\"text-align: center;\">";
	
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

function removeCustomer() {
	
url = "/service/customer/remove/" + $("#customer_id").val();
	
	$.ajax({
		url : url,
		type : 'POST',		
		success : function(data) {
			if(data == "success") {
				bootbox.confirm("Customer Removed Successfully, click Ok to continue", function(result) {
					window.location.href = "/service/customer/searchBy"
		    	});				
			}
			else {
				bootbox.alert("Unable to remove Customer", function() {
					 console.log("Error in removing Customer");
				});
			}
		},
		error : function(data) {
			console.log("Error : " + data.status);
		}
	});	
	
}