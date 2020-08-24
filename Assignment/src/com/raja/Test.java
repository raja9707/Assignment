package com.raja;

public class Test {
public static void main(String args[]) {
	
	A a=new A();
	A c=new A();
	a.b.c=c.b.a;
	
	
}
}

class A{
	B b=new B();
	
	
}
class B{
	String c;
	String a;
}