package com.sarkar.algo.math;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//System.out.println(1%10);
		System.out.println(isPalindrome(0));
	}
	
	
	public static boolean isPalindrome(int x) {
		if (x < 0)
            return false;
        int temp = 0, original = x;
        while(x > 0) {
        	int last = x % 10;
        	temp = temp * 10 + last;
        	x /= 10;
        }
        return original == temp;
    }

}
