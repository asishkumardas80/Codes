package com.library;

public class Video extends MediaItem{
	private int year;
	private String dir;
	private String gen;
Video(int i1, String t1, int n1, double r1, String d1, String g1, int y1){
	super(i1,t1,n1,r1);
	year=y1;
	dir=d1;
	gen=g1;
}
public String toString(){
	return "Info about Video:\nID: "+getid()+"\nTitle: "+getTitle()+"\nRuntime: "+get_data()+"\nNo. of Copies: "+get_Copies()+"\nDirector: "+dir+"\nGen :"+gen+"\nYear:"+year;
}
}
