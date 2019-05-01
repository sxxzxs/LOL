package com.classObeject;

class Animal2 {
	  private String name;
	  Animal2(String name) {this.name = name;}
	  
	  public void enjoy(){
	    System.out.println("請汒......");
	  }	  	 
}

class Cat3 extends Animal2 {
	  private String eyesColor;
	  Cat3(String n,String c) {super(n); eyesColor = c;}
	 
	  public void enjoy() {
	    System.out.println("癡請汒......");
	  } 
}

class Dog2 extends Animal2 {
	  private String furColor;
	  Dog2(String n,String c) {super(n); furColor = c;}
	 
	  public void enjoy() {
	    System.out.println("僩請汒......");
	  }
}

class Bird2 extends Animal2 {
	Bird2() {
		 	 super("Bird2");
	}
	public void enjoy() {
	    System.out.println("纏請汒......");
	}
}

class Lady {
    private String name;
    private Animal2 pet;
    Lady(String name,Animal2 pet) {
        this.name = name; this.pet = pet;
    }
    public void myPetEnjoy(){pet.enjoy();}
}

public class TestPolymoph {
    public static void main(String args[]){
        Cat3 c = new Cat3("Cat3name","blue");
        Dog2 d = new Dog2("Dog2name","black");
        Bird2 b = new Bird2();
        
        Lady l1 = new Lady("l1",c);
        Lady l2 = new Lady("l2",d);
        Lady l3 = new Lady("l3",b);
        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
        
        Animal2 e = new Cat3("Cat3name","blue");
        e.enjoy();
    }
}
