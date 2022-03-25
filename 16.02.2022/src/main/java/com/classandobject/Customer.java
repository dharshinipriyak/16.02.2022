package com.classandobject;

public class Customer 
{
	int Id;
	String Name,Address;
	public Customer() 
	{
		Id=2314;
		Name="varun";
		Address="delhi";
	}
	public void getCustomer()
	{
		System.out.println("CustomerId:"+Id);
		System.out.println("CustomerName:"+Name);
		System.out.println("CustomerAddress:"+Address);

	}

	public static void main( String[] args )
	{
		Customer Customer1=new Customer();
		System.out.println("***Customer Details***");
		Customer1.getCustomer();


	}

}
