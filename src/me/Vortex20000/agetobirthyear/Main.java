package me.Vortex20000.agetobirthyear;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = in.nextInt();
		int byear = 2014 - age;
		if(byear < 0){
			int bbyear = byear - byear - byear;
			System.out.println("You were born in " + bbyear + " B.C..");
		} else {
			System.out.println("You were born in A.D. " + byear + ".");	
		}
		in.close();
	}
}
