package com.library;

	class Journal extends WrittenItem{
		private int yearpub;
	Journal(int i1, String t1, int n1, String a1, int y1){
		super(y1, a1, y1, a1, y1);
		yearpub=y1;
	}
	public String toString(){

		return "Info about Book:\nID: "+getid()+"\nTitle: "+getTitle()+"\nAuthor: "+get_author()+"\nNumber of Copies: "+get_Copies()+"\nYear Of Publish:"+yearpub;

	}
}