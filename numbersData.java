package Vjezbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class numbersData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Please enter any number of integers with '0' marking the end of entry");
		
		Scanner input = new Scanner(System.in);
		Set<Integer> entryList = new TreeSet<>();
		while(input.hasNext()){
			entryList.add(input.nextInt());
			if(entryList.contains(0)){
				entryList.remove(0);
				break;
			}
		}
		
		System.out.println("If you would like to sort the numbers enter 'sort', if you would like to "
				+ "shuffle the numbers enter 'shuffle', if you would like reverse sort enter "
				+ "'reverse sort'");
		String action = enterAction();
		
		List<Integer> list = new ArrayList<>();
		for(int num: entryList)
			list.add(num);
		
		switch(action){
		case "sort": sort(list);
		break;
		case "shuffle": shuffle(list);
		break;
		case "reverse sort": reverseSort(list);
		break;
		}
		input.close();

	}

	private static String enterAction() {
		Scanner input = new Scanner(System.in);
		String action = input.nextLine();
		input.close();
		return action;
	}

	private static void sort(List<Integer> list) {
		for(int nums: list)
			System.out.println(nums);
	}
	
	private static void shuffle(List<Integer> list) {
		Collections.shuffle(list);
		for(int num: list)
			System.out.print(num + " ");
		System.out.println();
	}
	
	private static void reverseSort(List<Integer> list) {
		Collections.reverse(list);
		for(int num: list)
			System.out.print(num + " ");
		System.out.println();
	}
}
