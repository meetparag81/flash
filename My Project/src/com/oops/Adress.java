package com.oops;

public class Adress 
{
	
	private int HouseNo;
	private String detailAddress;
	private String City;
	private int pincode;
	
	public Adress()
	{
	this.HouseNo =100;
	this.detailAddress ="Ganesh Road";
	this.City = "une";
	this.HouseNo = 4;
	this.pincode=411011;
	}
	
	public Adress (int HouseNo,String detailAdress, String city, int pincode)
	{
		this.HouseNo = HouseNo;
		this.detailAddress =detailAdress;
		this.City = city;
		this.HouseNo = HouseNo;
		this.pincode = pincode;
	}
		
	@Override
	public String toString()
	{
		return "Adress [HouseNo=" + HouseNo + ", detailAddress=" + detailAddress + ", City=" + City + ", pincode="
				+ pincode + "]";
	}
	
}
