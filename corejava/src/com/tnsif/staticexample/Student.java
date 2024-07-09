package com.tnsif.staticexample;

public class Student {
	int rollno;
	String name;
	static String collegename="sri indu";
	static void change() {
		collegename="srinidhi";
	}
	Student (int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println("rollno"+""+name+""+"college");
	}

}
