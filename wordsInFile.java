package Vjezbe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class wordsInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the name of the file");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		input.close();
		
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("File " + fileName + " does not exist");
			System.exit(0);
		}
		
		List<String> wordsList = new ArrayList<>();
		Set<String> wordsSet = new HashSet();
		int totalNumWords = 0;
		int totalUniqueWords = 0;
		
		try {
			Scanner read = new Scanner(file);
			while(read.hasNext()){
				wordsList.add(read.next());
			}
			for(String word: wordsList)
				wordsSet.add(word);
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char[] chars = null;
		int totalVowelNum = 0;
		int totalConsonantNum = 0;
		for(String word: wordsList){
			word.toLowerCase();
			totalConsonantNum = totalConsonantNum + nuberOfConsonants(word);
			chars = word.toCharArray();
			totalVowelNum = totalVowelNum + numberOfVowels(chars);
		}
		
		System.out.println("Total number of words is: " + wordsList.size() + "\n"
							+ "Total number of unique words is: " + wordsSet.size() + "\n"
							+ "Total number of vowels is: " + totalVowelNum + "\n"
							+ "Total number of consonants is: " + totalConsonantNum);
	}

	private static int nuberOfConsonants(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
				continue;
			}
			else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				count++;
		}
		return count;
	}

	private static int numberOfVowels(char[] chars) {
		int count = 0;
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' ||chars[i] == 'u'){
				count++;
			}
		}
		return count;
	}

}
