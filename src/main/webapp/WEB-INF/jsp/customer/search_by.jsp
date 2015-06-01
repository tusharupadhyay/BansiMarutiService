<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../../layouts/taglibs.jsp"%>
<%@ include file="../../layouts/jqWidgetsLibs.jsp"%>


<h1 class="page-header">Search Customer By ${seachByParam}</h1>

<div class="row">
	<div class="col-lg-4 col-md-offset-4">
		<div class="input-group">
			<input id="searchInput" type="text" class="form-control" placeholder="Search for...">
			<span class="input-group-btn">
				<button class="btn btn-default" type="button" id="search">Go!</button>
			</span>
		</div>
		<!-- /input-group -->
	</div>
	<!-- /.col-lg-6 -->
	
	<br />
	<br />
	<br />
			
	<div id="table">
	</div>

	<!-- <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">...</div>
		</div>
	</div> -->




	<div style="visibility: hidden;" id="dialog">
        <div>Edit Customer</div>
        <div style="overflow: hidden;">
            <table style="table-layout: fixed; border-style: none; border-spacing: 5px;">
                               
                <tr>
                    <td align="left" >First Name:
                    </td>
                    <td align="right">
                        <input type="text" id="firstName" />
                    </td>
                </tr>
                <tr>
                    <td align="left">Middle Name:
                    </td>
                    <td align="left">
                        <input type="text" id="middleName" />
                    </td>
                </tr>
                <tr>
                    <td align="left">Last Name:
                    </td>
                    <td align="left">
                        <input type="text" id="lastName" />
                    </td>
                </tr>
                
				<tr>
                    <td align="left">Driving License:</td>
                    <td align="left">
                        <input type="text" id="drivingLicense" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Vehicle:</td>
                    <td align="left">
                        <input type="text" id="vehicle" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Email:</td>
                    <td align="left">
                        <input type="text" id="emailId" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Sex:</td>
                    <td align="left">
                        <input type="text" id="sex" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Address Line 1:</td>
                    <td align="left">
                        <input type="text" id="address_line1" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Address Line 2:</td>
                    <td align="left">
                        <input type="text" id="address_line2" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">City:</td>
                    <td align="left">
                        <input type="text" id="city" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">District:</td>
                    <td align="left">
                        <input type="text" id="district" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">State:</td>
                    <td align="left">
                        <input type="text" id="state" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Home Number:</td>
                    <td align="left">
                        <input type="text" id="homeNumber" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Mobile Number:</td>
                    <td align="left">
                        <input type="text" id="mobileNumber" />
                    </td>
                </tr>
                
                <tr>
                    <td align="left">Date Of Birth:</td>
                    <td align="left">
                        <div id="dateOfBirth"></div>
                    </td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center">
                         <br />
                         <button id="save">Save</button> <button style="margin-left: 5px;" id="cancel">Cancel</button></td>                    
                   </tr>
            </table>
        </div>
    </div>
	
	
</div>


<script type="text/javascript">
	$('dcoument').ready(function(){
		
		$('#search').click(function(){
			url = "/service/customer/searchByFirstName/" + $('#searchInput').val();
			 
			/* $.ajax({
				url : url,				
				type: 'POST',
				contentType: "application/json",
				mimeType: "application/json",
				success : function(data) {
					alert(data.firstName);
				},
				error : function(data) {
					alert("Error : " + data.status);
				}				
			});	 */
			
			// Data table task

            var source =
            {
            		dataType: "json",
            	    dataFields: [
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
            	    id: 'id',
            	    url: url,
                addRow: function (rowID, rowData, position, commit) {
                    // synchronize with the server - send insert command
                    // call commit with parameter true if the synchronization with the server is successful 
                    // and with parameter false if the synchronization failed.
                    // you can pass additional argument to the commit callback which represents the new ID if it is generated from a DB.
                    commit(true);
                },
                updateRow: function (rowID, rowData, commit) {
                    // synchronize with the server - send update command
                    // call commit with parameter true if the synchronization with the server is successful 
                    // and with parameter false if the synchronization failed.
                    commit(true);
                },
                deleteRow: function (rowID, commit) {
                    // synchronize with the server - send delete command
                    // call commit with parameter true if the synchronization with the server is successful 
                    // and with parameter false if the synchronization failed.
                    commit(true);
                }
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
                ready: function () {
                    // called when the DataTable is loaded.  
                    // init jqxWindow widgets.                   
                	$("#firstName").jqxInput({ width: 150, height: 30 });
                    $("#middleName").jqxInput({ width: '50%', height: 30 });
                    $("#lastName").jqxInput({ width: '50%', height: 30 });
                    $("#drivingLicense").jqxInput({ width: '50%', height: 30 });
                    $("#vehicle").jqxInput({ width: '50%', height: 30 });
                    $("#emailId").jqxInput({ width: 150, height: 30 });
                    var sexSource = new Array("Male", "Female");
                    $("#sex").jqxInput({source:sexSource, width: 150, height: 30 });
                    $("#address_line1").jqxInput({ width: 150, height: 30 });
                    $("#address_line2").jqxInput({ width: 150, height: 30 });
                    $("#city").jqxInput({ width: 150, height: 30 });
                    $("#district").jqxInput({ width: 150, height: 30 });
                    $("#state").jqxInput({ width: 150, height: 30 });
                    $("#homeNumber").jqxInput({ width: 150, height: 30 });
                    $("#mobileNumber").jqxInput({ width: 150, height: 30 });
                    $("#dateOfBirth").jqxDateTimeInput({ width: 150, height: 30 });                   
                    $("#save").jqxButton({ height: 30, width: 80 });
                    $("#cancel").jqxButton({ height: 30, width: 80 });
                    $("#cancel").mousedown(function () {
                        // close jqxWindow.
                        $("#dialog").jqxWindow('close');
                    });
                    $("#save").mousedown(function () {
                        // close jqxWindow.
                        $("#dialog").jqxWindow('close');
                        // update edited row.
                        var editRow = parseInt($("#dialog").attr('data-row'));
                        var rowData = {
                        		firstName: $("#firstName").val(), middleName: $("#middleName").val(),
                        		lastName: $("#lastName").val(), drivingLicense: $("#drivingLicense").val(),
                        		vehicle: $("#vehicle").val(), emailId: $("#emailId").val(),
                        		sex: $("#sex").val(), address_line1: $("#address_line1").val(),
                        		address_line2: $("#address_line2").val(), city: $("#city").val(),
                        		district: $("#district").val(), state: $("#state").val(),
                        		homeNumber: $("#homeNumber").val(), mobileNumber: $("#mobileNumber").val(),
                        		dateOfBirth: $("#dateOfBirth").val()
                        };
                        $("#table").jqxDataTable('updateRow', editRow, rowData);
                    });
                    $("#dialog").on('close', function () {
                        // enable jqxDataTable.
                        $("#table").jqxDataTable({ disabled: false });
                    });
                    $("#dialog").jqxWindow({
                        resizable: true,
                        //position: { left: $("#table").offset().left + 75, top: $("#table").offset().top + 35 },
                        position: 'center',
                        width: '60%', height: '100%',
                        autoOpen: false,
                        theme: 'energyblue',                        
                        isModal: true,
                        animationType: 'slide'
                    });
                    $("#dialog").css('visibility', 'visible');
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
                // update the widgets inside jqxWindow.
               
                $("#dialog").jqxWindow('setTitle', "Edit Row: " + row.firstName);
                $("#dialog").jqxWindow('open');
                $("#dialog").attr('data-row', index);
                $("#table").jqxDataTable({ disabled: true });
                $("#firstName").val(row.firstName);
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
               
            });		    
		});
	});
</script>
    