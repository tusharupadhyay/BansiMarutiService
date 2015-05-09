package com.bmsm.common.util;

import java.util.HashMap;

public class States {
	
	private static final HashMap<String, String> states = new HashMap<String, String>();	
	
	public static final String AP = "AP";
	public static final String AR = "AR";
	public static final String AS = "AS";
	public static final String BR = "BR";
	public static final String CT = "CT";
	public static final String GA = "GA";
	public static final String GJ = "GJ";
	public static final String HR = "HR";
	public static final String JK = "JK";
	public static final String HP = "HP";
	public static final String JH = "JH";
	public static final String KA = "KA";
	public static final String KL = "KL";
	public static final String MP = "MP";
	public static final String MH = "MH";
	public static final String MN = "MN";
	public static final String ML = "ML";
	public static final String MZ = "MZ";
	public static final String NL = "NL";
	public static final String OR = "OR";
	public static final String PB = "PB";
	public static final String RJ = "RJ";
	public static final String SK = "SK";
	public static final String TN = "TN";
	public static final String TG = "TG";
	public static final String TR = "TR";
	public static final String UT = "UT";
	public static final String UP = "UP";
	public static final String WB = "WB";
	
	// Union territory
	public static final String CH = "CH";
	public static final String DN = "DN";
	public static final String DD = "DD";
	public static final String DL = "DL";
	public static final String LD = "LD";
	public static final String PY = "PY";
	public static final String AN = "AN";	
	
	static {
		init();
	}
	
	private static void init() {		
		states.put(AP, "Andhra Pradesh");
		states.put(AR, "Arunachal Pradesh");
		states.put(AS, "Assam");
		states.put(BR, "Bihar");	
		states.put(CT, "Chhattisgarh");
		states.put(GA, "Goa");	
		states.put(GJ, "Gujarat");
		states.put(HR, "Haryana");	
		states.put(JK, "Jammu and Kashmir");
		states.put(HP, "Himachal Pradesh");
		states.put(JH, "Jharkhand");
		states.put(KA, "Karnataka");
		states.put(KL, "Kerala");
		states.put(MP, "Madhya Pradesh");
		states.put(MH, "Maharashtra");	
		states.put(MN, "Manipur");
		states.put(ML, "Meghalaya");	
		states.put(MZ, "Mizoram");
		states.put(NL, "Nagaland");
		states.put(OR, "Odisha");
		states.put(PB, "Punjab");	
		states.put(RJ, "Rajasthan");
		states.put(SK, "Sikkim");	
		states.put(TN, "Tamil Nadu");
		states.put(TG, "Telangana");
		states.put(TR, "Tripura");
		states.put(UT, "Uttarakhand");	
		states.put(UP, "Uttar Pradesh");
		states.put(WB, "West Bengal");
		
		// Union territory
		states.put(CH, "Chandigarh");
		states.put(DN, "Dadra and Nagar Haveli");	
		states.put(DD, "Daman and Diu");
		states.put(DL, "Delhi");	
		states.put(LD, "Lakshadweep");
		states.put(PY, "Puducherry");
		states.put(AN, "Andaman and Nicobar");
	}
	
	public static String getStateName(String code){
		if(!states.containsKey(code)) {
			//LOG.debug("Invalid state code " + code);
			return "Invalid State Code";
		}
		return states.get(code);		
	}	
}
