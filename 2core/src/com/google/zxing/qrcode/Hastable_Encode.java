package com.google.zxing.qrcode;

import java.util.Hashtable;

import com.google.zxing.EncodeHintType;


public final class Hastable_Encode {
	
	
	public static Hashtable hastable_Encode(String str){
		Hashtable hints= new Hashtable();   
		try{
	
    hints.put(EncodeHintType.CHARACTER_SET, str);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
    return hints;
	}

}
