package Vjezbe;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class bufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("student30.txt");
		BufferedReader output = Files.newBufferedReader(path);
		String line;
		while((line = output.readLine()) != null){
			System.out.println(line);
		}
	}

}
