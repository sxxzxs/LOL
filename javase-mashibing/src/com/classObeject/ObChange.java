package com.classObeject;

public class ObChange {
	public static void main(String[] args) {
		ObChange test = new ObChange();
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		test.f(a);
		test.f(c);
		
	}
	
	public void f(Animal a) {
		System.out.println("name :"+a.name);
		if(a instanceof  Cat) {
			Cat cat = (Cat)a;
			System.out.println
			(" "+cat.eyesColor+" eyes");
		}else if(a instanceof  Dog){
			Dog dog = (Dog)a;
			System.out.println
			(" "+dog.furColor+" furColor");
		}
	}
}

class Animal{
	public String name;
	
	Animal(String name){
		this.name = name;
	}
}

class Cat extends Animal{
	public String eyesColor;
	Cat(String n ,String c){
		super(n);
		eyesColor = c;
	}
}

class Dog extends Animal{
	public String furColor;
	Dog(String n ,String c){
		super(n);
		furColor = c;
	}
}