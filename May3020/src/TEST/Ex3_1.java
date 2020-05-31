package TEST;
public class Ex3_1 {
	public static void main(String[] args) {
		try {
			int a = 10, b01 = 2, b02 = 0, result = 0;
			result = a / b01;
			System.out.println(result);

			result = a / b02;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("실패!");

			System.out.println("--------------");

			e.printStackTrace();
		} finally {
			System.out.println("다시실행해주세요 ");
		} // finally
	}// main
}
