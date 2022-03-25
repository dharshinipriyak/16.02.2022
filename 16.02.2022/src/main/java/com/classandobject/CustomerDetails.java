package com.classandobject;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter age:");
        int age=scanner.nextInt();
        System.out.println("Enter gender:");
        String gender=scanner.next();
        scanner.nextLine();
        System.out.println("Hailing from:");
        String from=scanner.nextLine();
        System.out.println("Welcome," +name+"!");
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+from);
        scanner.close();
	}
	
}
