package Vjezbe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class readingStudent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path file = Paths.get("student2.txt");
		if(!Files.exists(file)){
			System.out.println("The file " + file.getFileName() + " does not exist");
			System.exit(0);
		}
		
		Scanner input = new Scanner(file);
		// Student students;
		ArrayList<Student> list = new ArrayList<>();
		while(input.hasNext()){
			String ime = input.next();
			String prezime = input.next();
			int id = input.nextInt();
			list.add(new Student(ime, prezime, id));
		}
		input.close();
		
		for(Student record: list)
			System.out.println(record.toString());
	}
}
