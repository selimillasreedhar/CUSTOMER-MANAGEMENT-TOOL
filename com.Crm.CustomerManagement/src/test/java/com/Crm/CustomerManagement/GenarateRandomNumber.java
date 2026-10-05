package com.Crm.CustomerManagement;

import java.util.Random;

public class GenarateRandomNumber {
	public static void main(String[] args) {
		Random r=new Random();
		int data = r.nextInt(20);
		System.out.println(data);
	}

}
