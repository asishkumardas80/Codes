package com.library;

public class CD extends MediaItem{
	private String art;
	private String gen;
CD(int i1, String t1, int n1, double r1, String d1, String g1){
	super(i1,t1,n1,r1);
	art=d1;
	gen=g1;
}

public String toString(){

	return "Information about Video:\nID: "+getid()+"\nart: "+art+"\nGenre: "+gen;

}

}
