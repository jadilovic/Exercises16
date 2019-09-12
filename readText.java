package Vjezbe;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class readText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Please enter the name of the file");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		System.out.println("Would you like to write all words including duplicates? Ente 'yes' for "
				+ "all words including duplicates. Enter 'no' to write words without duplicates");
		String duplicates = input.next();
		
		File file = new File("C:\\NewWorkspace\\Lekcija15\\src\\Vjezbe\\" + fileName);
		if(!file.exists()){
			System.out.println("File name " + fileName + " does NOT exist");
			System.exit(0);
		}
		input.close();
		
		Set<String> wordsSingle = new TreeSet<>();
		List<String> wordsDuplicates = new ArrayList<>();

		Scanner read = new Scanner(file);
		String word;

		while(read.hasNext()){
			word = read.next();
			if(duplicates.equals("yes"))
				wordsDuplicates.add(word);
			else
				wordsSingle.add(word);
		}
		read.close();
		
		if(duplicates.equals("yes")){
			Collections.sort(wordsDuplicates);
			for(String words: wordsDuplicates)
				System.out.println(words);
		}
		else{
			for(String words: wordsSingle)
				System.out.println(words);
		}
	}

}
