package com.dtweb.common;

import java.util.Calendar;
import java.util.Date;

public class Utility {
	public static Date getNowDate(){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		return cal.getTime();
	}
}
