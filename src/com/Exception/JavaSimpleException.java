package com.Exception;

public class JavaSimpleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num =123/0;
		}
       catch(ArithmeticException e) {
    	   System.out.println(e);
       }
		System.out.println("This will print");
	}

}
