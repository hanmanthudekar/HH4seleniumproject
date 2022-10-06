package com.qa.logicalPrograms;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		int c=0;
		
		for(int n=2;n<100;n++) {
			c=0;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(n);
			}
		}
	}
}
