package com.assignment;

import java.util.Scanner;
public class NivinNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter positive number");
		int n=sc.nextInt();
		
		int temp,r,sum=0;
		temp=n;
		while(temp>0) {
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		if(n%sum==0) {
			System.out.println("nivin number");}
		else {
			System.out.println("Not a nivun number");
	}}

}
