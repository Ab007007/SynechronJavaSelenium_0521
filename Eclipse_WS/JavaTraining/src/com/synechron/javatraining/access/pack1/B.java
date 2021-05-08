package com.synechron.javatraining.access.pack1;

public class B {

	public static void main(String[] args) {
		A a = new A();
		//a.printPrivateMember();
		
		a.printDefaultMember();
		a.printProtectedMember();
		a.printPublicMember();
	}
}
