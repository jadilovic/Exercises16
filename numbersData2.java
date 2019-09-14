package Vjezbe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class numbersData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter any number of integers with '0' marking the end of entry");
		
		ArrayList<Integer> enteredNums = new ArrayList<>();
		int index = -1;
		while(input.hasNext()){
			enteredNums.add(input.nextInt());
			index++;
			if(enteredNums.get(index) == 0){
				enteredNums.remove(index);
				break;
			}
		}
	
		System.out.println("Choose what to write: \n"
				+ "For the sum of all numbers enter 1.\n"
				+ "For the average of all numbers enter 2.\n"
				+ "For the sum of all even numbers enter 3.\n"
				+ "For the sum of all odd numbers enter 4.\n"
				+ "For the sum of all numbers at even positions enter 5.\n"
				+ "For the sum of all numbers at odd positions enter 6.\n"
				+ "To write all unieque numbers enter 7.\n"
				+ "To write all numbers that are repeated enter 8.\n"
				+ "To write all single unique numbers enter 9. \n"
				+ "Here: ");
		
		int selectionEntry = input.nextInt();

		switch(selectionEntry){
		case 1: sumOfNumbers(enteredNums);
		break;
		case 2: averageOfNumbers(enteredNums);
		break;
		case 3: sumOfEvenNumbers(enteredNums);
		break;
		case 4: sumOfOddNumbers(enteredNums);
		break;
		case 5: sumAtEvenPositions(enteredNums);
		break;
		case 6: sumAtOddPositions(enteredNums);
		break;
		case 7: uniqueNumbersOnly(enteredNums);
		break;
		case 8: repeatedNumbersOnly(enteredNums);
		break;
		case 9: uniqueSingleNumbersOnly(enteredNums);
		break;
		}

	}

	private static void uniqueSingleNumbersOnly(ArrayList<Integer> enteredNums) {
		Set<Integer> uniqueNums = new HashSet<>();
		for(int num: enteredNums)
			uniqueNums.add(num);
		for(Integer num: uniqueNums)
			enteredNums.remove(num);
		uniqueNums.removeAll(enteredNums);
		System.out.print("Unique numbers are: ");
		for(int num: uniqueNums)
			System.out.print(num + " ");
		System.out.println();
		System.out.print("Repeated entered numbers are: ");
		for(int num: enteredNums)
			System.out.print(num + " ");
	}

	private static void repeatedNumbersOnly(ArrayList<Integer> enteredNums) {
		// TODO Auto-generated method stub
		
	}

	private static void uniqueNumbersOnly(ArrayList<Integer> enteredNums) {
		Set<Integer> uniqueNums = new HashSet<>();
		for(int num: enteredNums)
			uniqueNums.add(num);
		System.out.print("Unique numbers are: ");
		for(int num: uniqueNums)
			System.out.print(num + " ");
	}

	private static void sumAtOddPositions(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int i = 0; i < enteredNums.size(); i++){
			if(i % 2 != 0)
				totalSum += enteredNums.get(i);
		}		
		System.out.println("Total sum at odd positions is: " + totalSum);
	}

	private static void sumAtEvenPositions(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int i = 0; i < enteredNums.size(); i++){
			if(i % 2 == 0)
				totalSum += enteredNums.get(i);
		}		
		System.out.println("Total sum at even positions is: " + totalSum);
	}

	private static void sumOfOddNumbers(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int num: enteredNums){
			if(num % 2 != 0)
				totalSum += num;
		}		
		System.out.println("Total sum of odd numbers is: " + totalSum);
	}

	private static void sumOfEvenNumbers(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int num: enteredNums){
			if(num % 2 == 0)
				totalSum += num;
		}		
		System.out.println("Total sum of even numbers is: " + totalSum);
	}

	private static void averageOfNumbers(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int num: enteredNums)
			totalSum += num;
		double average = totalSum / enteredNums.size();
		System.out.println("Average number is: " + average);
	}

	private static void sumOfNumbers(ArrayList<Integer> enteredNums) {
		int totalSum = 0;
		for(int num: enteredNums)
			totalSum += num;
		System.out.println("Sum of all numbers is: " + totalSum);
	}
}
