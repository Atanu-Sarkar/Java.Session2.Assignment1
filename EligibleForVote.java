package com.acadgild.session.two;

import java.util.Scanner;

public class EligibleForVote {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter your age:");
		age = input.nextInt();
		
		if (age >=18){
			System.out.println("You are eligible to vote"); 
			}
		else{
			System.out.println("You are not eligible to vote"); 
			}
	}

}
