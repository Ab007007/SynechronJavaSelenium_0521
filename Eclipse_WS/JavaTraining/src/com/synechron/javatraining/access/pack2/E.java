package com.synechron.javatraining.access.pack2;

import com.synechron.javatraining.access.pack1.A;

public class E extends A {

	
	public static void main(String[] args) {
		E a = new E();
		
		a.printProtectedMember();
		a.printPublicMember();
		//a.allVariables();
		
	}
}
