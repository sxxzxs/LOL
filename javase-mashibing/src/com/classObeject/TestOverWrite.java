package com.classObeject;

class Person1 {
    private String name;
    private int age;
    public void setName(String name){this.name=name;}
    public void setAge(int age) {this.age=age;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getInfo() {
          return "Name: "+ name + "\n" +"age: "+ age;
  }
}

class Student extends Person1 {
    private String school;
    public String getSchool() {return school;}
    public void setSchool(String school)
    {this.school =school;}
    public String getInfo() {
      return  "Name: "+ getName() + "\nage: "+ getAge() 
                    + "\nschool: "+ school;
		}
}

public class TestOverWrite {
public static void main(String arg[]){
        Student student = new Student();
        Person1 Person1 = new Person1();
        Person1.setName("none");
        Person1.setAge(1000);
        student.setName("John");    
        student.setAge(18);
        student.setSchool("SCH");
        System.out.println(Person1.getInfo());
        System.out.println(student.getInfo());
    }
}

