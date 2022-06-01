package Homework;

import java.util.Scanner;

public class Homework01 {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			/*
			 * #6
			 * Write a program to swap 2 numbers without a
			 * temporary variable?
			 */
			System.out.println("Please enter 1st number");
			int num1 = scan.nextInt();
			System.out.println("Please enter 2nd number");
			int num2 = scan.nextInt();
			System.out.println("Lets swap your numbers");
			num1 = num1+num2;
			num2 = num1-num2;
			num1 = num1-num2;
			System.out.println("Now 1st number is " + num1);
			System.out.println("and 2nd number is " + num2);
			
			System.out.println();
			
			/*
			 * #1
			 * Using Scanner create an array of integer values. After
			 * the array is created, calculate the sum of all stored
			 * elements in that array.
			 */
			System.out.println("Please enter how big you want your array");
			int size = scan.nextInt();
			int sum =0;
			
			int[] numbers = new int[size];
			for(int a=0; a<numbers.length; a++) {
				System.out.println("Please enter your #" +(a+1));
				numbers[a] = scan.nextInt();
				sum += numbers[a];
				
			}
			System.out.println("The sum of your numbers = " + sum);
			
			System.out.println();
			
			/*
			 * #2 Using Scanner create an array of countries. When an
			 * array is created, retrieve all values from it and while
			 * retrieving those values print capital for each country.
			 * (use 2 different loops).
			 */
			
			System.out.println("Please enter how many countries you want to store?");
			int size1 = scan.nextInt();
			
			String[] cntr = new String[size1];
			String[] cap = new String[size1];
			for(int a=0; a<cntr.length; a++){
				System.out.println("Please enter your country#" + (a+1));
				cntr[a] = scan.next();
				System.out.println("Please enter " + cntr[a] + "'s capital");
				cap[a] = scan.next();
				
				}
			for(int a = 0; a<cntr.length; a++) {
				System.out.println("The capital of " + cntr[a] + " is " + cap[a]);
			}
			
			for(String i:cap) {
				System.out.println("All capitals we stored are: "+i);
			}
			
			System.out.println();
			
			/*
			 * #3 Create a 2D array of integer values. Print the sum of 
			 * all numbers.
			 */
			
			int[][] num3 = {{13,15,17,11},{985, 98, 55, 44, 5}};
			sum = 0;
			
			
			for(int a = 0; a<num3.length; a++) {
				for(int b =0; b<num3[a].length; b++) {
					sum+= num3[a][b];
			}
				
			
			}
			
			System.out.println("Total values of elements is " + sum);
			System.out.println();
			
			/*
			 * #4 Create a 2D array or integer type where you will store
			 * odd and even numbers. Develop a program which will
			 * identify/print the even numbers only
			 */
			
			int[][] num4 = {{1, 2, 3, 4, 5},{6, 7, 8 ,9},{1, 2 ,3 ,44}};
			
			for(int a = 0; a < num4.length; a++) {
				for(int b = 0; b<num4[a].length; b++) {
					if(num4[a][b]%2==0) {
						System.out.print(num4[a][b] + " ");
					}
				}
			}
			
			System.out.println();
			
			/*
			 * #5 Create a 2D array of integers. Develop a program
			 * which will calculate the sum of even and odd numbers
			 * for that array. 
			 */
			
			int[][] num5 = {{1,2,3,4,5,6},{5, 6, 7, 8, 9},{11, 12, 55, 48}}; 
			
			int allodd = 0;
			int alleven = 0;
			
			for(int a=0; a<num5.length; a++) {
				for(int b=0; b<num5[a].length; b++) {
					if(num5[a][b]%2==0) {
						alleven+=num5[a][b];
					} else {
						allodd+=num5[a][b];
					}
					
				}
				
			}
			System.out.println("Sum of all odd numbers is " + allodd);
			System.out.println("Sum of all even numbers is " + alleven);
			
			System.out.println();
			
			/*
			 * #7 Write a java program to check whether a given
			 * number is prime or not?
			 */
			
			System.out.println("Please enter your number");
			double num6 = scan.nextDouble();
			boolean f = true;
			if(num6==0 || num6==1) {
				System.out.println(num6 + " is not prime number");
			} else if(num6==2) {
				System.out.println(num6 + " is a prime number");
			} else {
				for(int a = 2; a<=num6/2; a++) {
					if(num6%a==0) {
						f = false;
						System.out.println(num6 + " is not a prime number");
						break;
					} 
				}
			}
			if(f == true) {
				System.out.println(num6 + " is prime number");
			}
			
			System.out.println();
			
			/*
			 * #8 Write a Java Program to print the first 10 numbers of
			 * Fibonacci series.
			 */
			
			int num7 = 0;
			int num8 = 1;
			int sum5 = 0;
			System.out.println("Please enter how many time you want to run");
			int count = scan.nextInt();
			
			for(int a = 1; a<count; a++) {
				
				sum5 = num7 + num8;
				num7 = num8;
				num8 = sum5;
			}
			
			System.out.println(sum5);
			System.out.println();
			
			/*
			 * #9 Maximum and minimum number in the array?
			 */
			
			int[] num9 = {1,245,6546,656,23};
			int max = num9[0];
			int min = num9[0];
			int max1 = num9[0];
			for(int a=1; a<num9.length; a++) {
				if(max>num9[a]) {
				} else {
				max = num9[a];
				}
			}
			System.out.println(max + " is the largest number");
			
			for(int num:num9) {
				if(min<num) {
				} else {	
					min=num;
				}
			}
			System.out.println(min + " is the smallest number");
			System.out.println();
			
			/*
			 * #10 Write a java program to find the second largest
			 * number in the array?
			 */
			int[] num10 = {1,654757,143546,45354,23};
			int max2 = num10[0];
			int max3 = num10[0];
			for(int num:num10) {
				if(num>max2) {
					max3=max2;
					max2=num;
				} else if(num>max3) {
					max3=num;
				}
			}
			System.out.println(max3 + " is the second largest number");
			
			System.out.println();
			
			/*
			 * #11 Write a program to print out duplicate elements from
			 * an Array of Strings?
			 */
			
			String[] animals = {"dog", "cat", "bear", "girrafe", "tiger", "dog", "cat"};
			
			String[] duplicate = new String[animals.length];
			
			for(int a=0; a<animals.length; a++) {
				duplicate[a]="";
				for(int b=a+1; b<animals.length; b++) {
					if(animals[a].equalsIgnoreCase(animals[b])) {
						duplicate[a]=animals[b];
					} else {
						continue;
					}
				}System.out.print(duplicate[a] + "");
			}
			
		}
	}

