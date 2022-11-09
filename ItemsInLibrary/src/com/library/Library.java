package com.library;

public class Library{
	
public static void main(String a[]){
	Book b1 = new Book(20120, "Wings of Fire",10," A. P. J. Abdul Kalam",1999);
	System.out.println(b1);

	b1.checkOut();
	 System.out.println("+-------------------+");

	System.out.println("\nAfter Checkout"+"\n"+b1);

 System.out.println("+-------------------+");

	System.out.println(new Video(10001, "Baahubali: The Beginning",6,2.38,"S. S. Rajamouli","Action/War",2015));

}

}
