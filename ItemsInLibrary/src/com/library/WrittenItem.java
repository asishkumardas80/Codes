package com.library;
// all the abstract class extend item are below there
//WritteItem.java
	abstract class WrittenItem extends Item{
		private String auth;
		 int pub;
		WrittenItem(int i1, String t1, int n1, String a1, int i) {
			super(i1,t1,n1);
			auth=a1;
			pub=i;
	 }
	 public String get_author(){
	 return auth;
	 }
	 
	
	
	}