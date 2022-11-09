package com.library;

//class for Media item 
	public abstract class MediaItem extends Item{
			private double data;

		MediaItem(int i1, String t1, int n1, double data){
			super(i1,t1,n1);
			this.data=data;
		}
	public double get_data(){
			return data;
		}
	}
	
