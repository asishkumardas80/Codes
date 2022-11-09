package com.library;
// Item in abstract class
public abstract class Item {
	 private int id1;
	 private String titl;
	 private int numbcopies;
	 Item(int i1, String t1, int n1){
		 id1=i1;
		 titl=t1;
		 numbcopies=n1;
	 }
	 public void addItem(){
		 this.numbcopies++;
	 }
	 public void checkIn(){
		 numbcopies++;  
	 }
	 public void checkOut(){
		 if(numbcopies> 0) numbcopies--;
		 else System.out.println("No Copies available");
	 }
	 public void setid(int i){
		 id1=i;
	 }
	 public int getid(){
		 return id1;
	 }
	 public void settitle(String s1){
		 titl=s1;
	 }
	 public String getTitle(){
		 return titl;
	 }
	 public void setCopies(int n1){
		 numbcopies=n1;
	 }
	 public int get_Copies(){
		 return numbcopies;
	 }

}
	
