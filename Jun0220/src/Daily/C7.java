package Daily;

import java.util.Arrays;

class ArrayPrint {

	void printArray(String[] sArr) {
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i] + "");
		}
		System.out.println();

	}

	void printArray(int[] iArr) {
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i] + "");
		}
		System.out.println();
	}

	void printArray(char[] cArr) {
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i] + "");
		}
		System.out.println();
	}

}

public class C7 {
	public static void main(String[] args) {

		ArrayPrint ap = new ArrayPrint();
		String[] sArr = { "홍길동", "이순신", "김길동" };
		int[] iArr = { 1, 2, 3, 4, 5 };
		char[] cArr = { '가', '나' };

		ap.printArray(sArr);
		ap.printArray(iArr);
		ap.printArray(cArr);
	}
}
