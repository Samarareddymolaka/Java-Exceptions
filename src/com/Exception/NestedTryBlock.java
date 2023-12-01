package com.Exception;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	try  {
		int num = 123/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("this will execute");

try {
	int[] num = {0,1,2};
	System.out.println(num[3]);
}
catch (ArrayIndexOutOfBoundsException e1) {  
    System.out.print(e1);  

	}
//System.out.println("Array index will print");
}
catch (Exception e3){
	System.out.println(e3);
	System.out.println("I am printed, if no one is true");
}
	
}
}