package com.Exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= new int[5];
			a[3]=55/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArthematicException occured");
		}
         catch(ArrayIndexOutOfBoundsException e) {
        	 System.out.println("ArrayIndexOutOfBoundsException occured");
         }
		catch(Exception e) {
       	 System.out.println("Parent Exception  occurs");
        }
      	 System.out.println("This will execute");
		
	}

}
