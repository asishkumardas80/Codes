package com.library;

public class Book extends WrittenItem{

		Book(int i1, String t1, int n1, String a1, int i){
			super(i1,t1,n1,a1,i);
	}

	public String toString(){

		return "Info about Book:\nID: "+getid()+"\nTitle: "+getTitle()+"\nAuthor: "+get_author()+"\nNumber of Copies: "+get_Copies()+"\nYear Of Publish:"+pub;

	}

}
