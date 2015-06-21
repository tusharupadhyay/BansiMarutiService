/**
 * 
 */

function initialize(customers) {	
	createDataTable( customers );
}


function createDataTable(data) {
	// Data table task	
	
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
    
    /*$("#table").on('rowDoubleClick', function (event) {
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
        
    });*/

    /*$('#updateButton').click(function() {
    	    	
    	window.location.href = "/service/customer/updateCustomer/" + $("#customer_id").val();    	
    	
    });	*/

}