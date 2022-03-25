package com.classandobject;

public class Laptop 
{
	String Brand, RAM, Harddisk;
	int price;
	int Manufacturingdate;
	
	public Laptop() 
	{
		Brand="Lenovo";
		RAM="4GB";
		Harddisk="1TB";
		price =20000;
		Manufacturingdate=2020;
	}
	public void getLaptopDetails()
	{
		System.out.println("**Laptop Details**");
		System.out.println("Brand Name         :"+Brand);
		System.out.println("RAM                :"+RAM);
		System.out.println("Hard Disk          :"+Harddisk);
		System.out.println("Price              :"+price);
		System.out.println("Manufacturing Date :"+Manufacturingdate);
		
	}
	public static void main(String[] args) 
	{
		Laptop Laptops=new Laptop();
		Laptops.getLaptopDetails();
		

	}

}
