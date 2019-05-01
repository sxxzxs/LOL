package com.classObeject;

public class Constructor {//构造方法
	int id;
	int age = 20;
	
	Constructor(int _id,int _age){
		id = _id;
		age = _age;
	}
	
	public static void main(String[] args) {
		Constructor tom = new Constructor(1, 25);
		System.out.println(tom.age);
		
	}

}
