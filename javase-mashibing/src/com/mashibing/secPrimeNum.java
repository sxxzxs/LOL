package com.mashibing;

/*
 * 求101~200之间的质数
 * */
 
public class secPrimeNum {
	public static void main(String[] args) {
				
		for(int i = 101; i < 200; i += 2) {
			boolean a = true;
			for(int j = 2; j < i; ++j) {
				if(i % j == 0) {
					a = false;
					break;
				}				
			}
			if(!a) {
				continue;
			}
			System.out.println(" " + i);
		}
		
	}

}
