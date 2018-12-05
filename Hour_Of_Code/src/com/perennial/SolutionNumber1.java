package com.perennial;

public class SolutionNumber1 {

	public static void main(String[] args) {
		boolean result = isPrime(10, 2);
		
		print(2, 10);	
		}
	
	public static void print(int x,int y) {
		if(x<=y) {
			if(isPrime(x, 2)) {
			System.out.println(x);}
		}
		if(x>y) {
			return;
		}
		print(x+1,y);
	}
	
	   static boolean isPrime(int n, int i) 
	    { 
	        if (n <= 2) 
	            return (n == 2) ? true : false; 
	        if (n % i == 0) 
	            return false; 
	        if (i * i > n) 
	            return true; 
	       
	        return isPrime(n, i + 1); 
	    } 
}
