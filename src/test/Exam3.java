package test;

/*
결과가 나오도록 round 함수 구현하기
String.format() 사용
*/
public class Exam3 {
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1)); // 3.1
		System.out.println(round(3.1415, 2)); // 3.14
		System.out.println(round(3.1415, 3)); // 3.142
		System.out.println(round(3.1415, 4)); // 3.1415
	}

	private static String round(double d, int i) {
		return String.format("%."+i+"f", d);
	}
}
