package com.Crm.CustomerManagementGenericlibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Javautality {
	public String getDateAndTime(String patten) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(patten);
		String value = sdf.format(d);
		return value;
	}
public int generateRandomNumber(int number) {
	Random r=new Random();
	int data = r.nextInt(number);
	return data;
}
}
