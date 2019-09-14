package Vjezbe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraySpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkList = new LinkedList<>();
		
		for(int i = 0; i < 5000; i++){
			int random = (int) ((Math.random() * 99) + 1);
			arrList.add(random);
			linkList.add(random);
		}
		
		speed(arrList);
		speed(linkList);
		
		speedGet(arrList);
		speedGet(linkList);
	}

	private static void speedGet(List<Integer> list) {
		long miliSecStart = System.currentTimeMillis();
		int line = 0;
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
			line++;
			if(line == 500){
				System.out.println();
				line = 0;
			}
		}
		long miliSecEnd = System.currentTimeMillis();
	System.out.println();
	System.out.println("Time needed for GET " + list.getClass() + " is " + (miliSecEnd - miliSecStart));
	System.out.println();
	}

	private static void speed(List<Integer> list) {
		long miliSecStart = System.currentTimeMillis();
		int line = 0;
		for(int i: list){
			System.out.print(i + " ");
			line++;
			if(line == 500){
				System.out.println();
				line = 0;
			}
		}
		long miliSecEnd = System.currentTimeMillis();
	System.out.println();
	System.out.println("Time needed for FOR " + list.getClass() + " is " + (miliSecEnd - miliSecStart));
	System.out.println();
	}
}
