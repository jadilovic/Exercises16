package Vjezbe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Please enter the name of the file");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();

		
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("File " + fileName + " does not exist");
			System.exit(0);
		}
		
		System.out.println("Please enter a single word: ");
		String word = input.next();
		input.close();
		
		Scanner read = new Scanner(file);
		int count = 0;
		int countLine = 0;
		
		while(read.hasNextLine()){
			String textLine = read.nextLine();
			countLine++;
			String[] wordsInLine = textLine.split(" ");
			for(int i = 0; i < wordsInLine.length; i++){
				if(wordsInLine[i].equals(word)){
					count++;
					System.out.println("Word " + word + " is in the line #" + countLine + "\n"
							+ "and at the postion in the line #" + (i + 1));
				}
			}
		}
		System.out.println("There are " + count + " words " + word + "s in file " + fileName);
		read.close();
	}
}
