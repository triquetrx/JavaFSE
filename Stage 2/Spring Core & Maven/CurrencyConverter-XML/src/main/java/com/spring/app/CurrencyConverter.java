package com.spring.app;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

public class CurrencyConverter {
	@Autowired
	private Map<String,String> mObj;
	
	
	public Map<String, String> getmObj() {
		return mObj;
	}


	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}


		public int getTotalCurrencyValue(String value)
    	{
			String input = value.toUpperCase();
			for(Entry<String, String> entry : mObj.entrySet()) {
				String currencyName = entry.getKey();
				if(input.contains(currencyName)){
					return (Integer.parseInt(input.substring(0,input.indexOf(currencyName))))*(Integer.parseInt(entry.getValue()));
				}
			}
	        return 0;
	 
	    }	
	
		    	    	     	      	 	

}
