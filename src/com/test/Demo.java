package com.test;

import java.util.Random;

public class Demo {
	public  int max(int m, int n) {
		return m>n ? m :n ;
	}
	
	public  int min(int m, int n) {
		return m>n ? n:m;
	}
	
	public int random(int n) {
		Random rnd = new Random();
		return rnd.nextInt(n)+1; //1~n사이 하나의 난수 
	}
}
