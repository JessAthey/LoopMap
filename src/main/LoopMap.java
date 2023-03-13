package main;

import java.util.Scanner;
import java.util.ArrayList;

public class LoopMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0; i<5; i++) {
			System.out.println("Please enter a number 1-99");
			int num = input.nextInt();
			nums.add(num);
		}
		
//		System.out.println(nums);
		int sum = 0;
		for(int i=0; i<nums.size(); i++) {
			sum += nums.get(i);
		}
		
		int product = 1;
		for(int i=0; i<nums.size(); i++) {
			product *= nums.get(i);
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<nums.size(); i++) {
			int currentNum = nums.get(i);
			if(currentNum > max) {
				max = currentNum;
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<nums.size(); i++) {
			int currentNum = nums.get(i);
			if(currentNum < min) {
				min = currentNum;
			}
		}
		input.close();
		System.out.println("The sum of your number choices is: " + sum);
		System.out.println("The product of your number choices is: " + product);
		System.out.println("The largest number entered is: " + max);
		System.out.println("The smallest number entered is " + min);
	}
	

}
