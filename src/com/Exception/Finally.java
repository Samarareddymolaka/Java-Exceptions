package com.Exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// try {
//	 int num=10/0;
// }
//  catch (Exception e) {
//	  System.out.println(e);
//  }
//   try {
//	   String [] sar = {"sa","as","av","ce"};
//	   System.out.println(sar[4]);
//   }
//    catch(Exception e2) {
//    	System.out.println(e2);
//    }
//	}
//
//}

	  try{    
	   int data=95/5;    
	   System.out.println(data);    
	  }    
	
	  catch(NullPointerException e){  
	System.out.println(e);  
	}   
	  
	 finally {  
	System.out.println("finally block is always executed");  
	}    
	    
	System.out.println("rest of the code is executed...");    
	  }    
	}    