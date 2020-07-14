package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class practice_02 {
	public static void main(String[] args) throws IOException {

		FileReader fin;
		try {
			fin = new FileReader("./src/practice/practice.txt");

			int c;
			while ((c = fin.read()) != -1) {
				System.out.println((char) c);
			}

			fin.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
