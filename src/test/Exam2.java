package test;

/*
 * 한곳만 수정하여 다음의 결과나 나오도록 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Exam2 {
	public static void main(String[] args) {
		String str = "base";
		System.out.println(str = str.replace('e', 'k') + "et");// basket
		str += "ball";
		System.out.println(str); //baseball
	}
}