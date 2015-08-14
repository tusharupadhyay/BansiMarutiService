package com.bmsm.common.util;

public enum EmployeeStatus {
	
	ACTIVE(0), INACTIVE(1), NOT_WORKING(2);
	
	private final int value;
	
	private EmployeeStatus(int value) {
		this.value = value;
	}
	
	public int getValue() {		
		return this.value;
	}
	
	public String getName() {
		return this.name();
	}
	
	public static EmployeeStatus findByCode(int value){
	    for(EmployeeStatus status : values()){
	        if( status.getValue() == value){
	            return status;
	        }
	    }
	    return null;
	}
}
