package com.classObeject;

abstract class Animal6 {
	  private String name;
	  Animal6(String name) {this.name = name;}
	  /*
	  public void enjoy(){
	    System.out.println("請汒......");
	  }
	  */
	  public abstract void enjoy();
	}

	abstract class Cat6 extends Animal6 {
	  private String eyesColor;
	  Cat6(String n,String c) {super(n); eyesColor = c;}
	  /*
	  public void enjoy() {
	    System.out.println("癡請汒......");
	  }
	  */
	  //public abstract void enjoy();
	}

	class Dog6 extends Animal6 {
	  private String furColor;
	  Dog6(String n,String c) {super(n); furColor = c;}
	 
	  public void enjoy() {
	    System.out.println("僩請汒......");
	  }
	}

	class Bird6 extends Animal6 {
		 Bird6() {
		 	 super("Bird6");
		 }
		 public void enjoy() {
	    System.out.println("纏請汒......");
	  }
	}

	class Lady6 {
	    private String name;
	    private Animal6 pet;
	    Lady6(String name,Animal6 pet) {
	        this.name = name; this.pet = pet;
	    }
	    public void myPetEnjoy(){pet.enjoy();}
	}

	public class TestPolymoph1 {
	    public static void main(String args[]){
	        //Cat6 c = new Cat6("Cat6name","blue");
	        Dog6 d = new Dog6("Dog6name","black");
	        Bird6 b = new Bird6();
	        //Lady6 l1 = new Lady6("l1",c);
	        Lady6 l2 = new Lady6("l2",d);
	        Lady6 l3 = new Lady6("l3",b);
	       //l1.myPetEnjoy();
	        l2.myPetEnjoy();
	        l3.myPetEnjoy();
	    }
	}

