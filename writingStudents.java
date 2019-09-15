package Vjezbe;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class writingStudents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		for(int i = 0; i < 3; i++){
		Path path = Paths.get("student3" + i + ".txt");
		Files.createFile(path);
		}
		
		Student students = new Student();
		Path path = Paths.get("student30.txt");
		BufferedWriter output = Files.newBufferedWriter(path);
		for(int i = 0; i < 10; i++){
			students = new Student("ime" + i, ", prezime" + i, i);
			String studentRec = students.toString();
			output.write(studentRec);
			output.write("\n");
		}
		output.close();
	}
}
