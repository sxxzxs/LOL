package com.classObeject;

public class testToString {

	public static void main(String[] args) {
		Bird a = new Bird();
		System.out.println("bird: "+ a);//�ȼ���a.toString()

	}

}

class Bird {
	public String toString() {
		return "I am a cool bird!";
	}
}
