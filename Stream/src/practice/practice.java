package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practice {
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("./src/Stream_th/practice.java");
			fos = new FileOutputStream("./src/Stream_th/practice.txt");
			int readDate = -1;

			while ((readDate = fis.read()) != -1) {

				fos.write(readDate);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
