package com.Exception;

public class ThrowKeyword {
	
	 public static void validate(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Sorry, you are not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Yes, You are eligible to cast your vote");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	        validate(19);  
	        
	        	 System.out.println("Please Get Ready to cast");  
	        }
	         
	  }    

