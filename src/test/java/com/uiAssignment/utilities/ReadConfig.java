package com.uiAssignment.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	public String getDepartCity(){
		String deptCity = pro.getProperty("departureCity");
		return  deptCity;
	}

	public String getDestinationCity(){
		String destinationCity = pro.getProperty("destinationCity");
		return  destinationCity;
	}

	public String getPassengerName(){
		String passengerName = pro.getProperty("passengerName");
		return  passengerName;
	}

	public String getPassengerAddress(){
		String passengerAddress = pro.getProperty("passengerAddress");
		return  passengerAddress;
	}

	public String getCityName(){
		String cityName = pro.getProperty("cityName");
		return  cityName;
	}

	public String getStateName(){
		String stateName = pro.getProperty("stateName");
		return  stateName;
	}

	public String getZipCode(){
		String passengerzipCode = pro.getProperty("passengerzipCode");
		return  passengerzipCode;
	}

	public String getCreditCardType(){
		String creditCardType = pro.getProperty("creditCardType");
		return  creditCardType;
	}

	public String getCreditCardNum(){
		String creditCardNum = pro.getProperty("creditCardNum");
		return  creditCardNum;
	}

	public String getCreditCardExpiryMonth(){
		String creditCardExpiryMonth = pro.getProperty("creditCardExpiryMonth");
		return  creditCardExpiryMonth;
	}

	public String getCreditCardExpiryYr(){
		String creditCardExpiryYr = pro.getProperty("creditCardExpiryYr");
		return  creditCardExpiryYr;
	}

	public String getnameOnTheCC(){
		String nameOnTheCC = pro.getProperty("nameOnTheCC");
		return  nameOnTheCC;
	}

	
}




