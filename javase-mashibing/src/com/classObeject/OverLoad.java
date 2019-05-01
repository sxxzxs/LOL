package com.classObeject;

public class OverLoad {
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person(400);
		Person p2 = new Person(2, 50);
		
		p.info();
		p1.info("ok");		
	}

}


class Person{
	
	Person(){
		id = 0;
		age = 20;
	}
	
	Person(int _id){
		id = _id;
		age = 23;
	}
	
	Person(int _id,int _age){
		id = _id;
		age = _age;
	}
	
	//��Ա��������
	private int id;
	private int age;
	
	//��������
	public int getAge() {return age;}
	public void setAge(int i) {age = i;}
	public int getId() {return id;}
	
	void info() {
		System.out.println("my id is :" + id);
	}
	
	void info(String t) {
		System.out.println(t + "id" +id);
	}
	
}
