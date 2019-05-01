package com.classObeject;

public class Cat1 {
    private static int sid = 0;
    private String name; 
    int id;
    Cat1(String name) {
        this.name = name;  
        id = sid++;
    }
    public void info(){
        System.out.println
               ("My name is "+name+" No."+id);
    }
    public static void main(String arg[]){

        Cat1.sid = 100;
        Cat1 mimi = new Cat1("mimi");
        mimi.sid = 2000;
        Cat1 pipi = new Cat1("pipi");
        mimi.info(); 
        pipi.info();
        System.out.println("此时猫的sid为:  "+Cat1.sid);
    }
}

