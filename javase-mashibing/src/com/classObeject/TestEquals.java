package com.classObeject;

public class TestEquals {
	public static void main(String[] args) {
		Pig c1 = new Pig(1, 2, 3);
		Pig c2 = new Pig(1, 2, 6);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); 
	}
}

class Pig {
	int color;
	int height, weight;
	
	public Pig(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
	//equals∑Ω∑®÷ÿ–¥
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else {
			if(obj instanceof Pig) {
				Pig c = (Pig)obj;
				if(c.color == this.color && c.height == this.height && c.weight == this.weight) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
