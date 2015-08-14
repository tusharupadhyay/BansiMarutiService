package com.bmsm.common.util;

public enum Day {

	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
	
	private final int value;
	
	private Day(int value) {
		this.value = value;
	}
	
	public int getValue() {		
		return this.value;
	}
	
	public String getName() {
		return this.name();
	}
	
	public static Day findByCode(int value){
	    for(Day day : values()){
	        if( day.getValue() == value){
	            return day;
	        }
	    }
	    return null;
	}

}
