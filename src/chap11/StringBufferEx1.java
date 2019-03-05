package chap11;
/*
 * StringBuffer 클래스 예제
 * 1. 동적 문자열.
 * 2. equals 메서드가 오버라이딩 되어 있지 않음 => 내용비교를 위해서는 String 으로 변경 후 내용비교를 해야 함
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer  sb1 = new StringBuffer("abc");
		StringBuffer  sb2 = new StringBuffer("abc");
		if(sb1.equals(sb2)) {
			System.out.println("sb1 과 sb2의 내용은 같다.");
		} else {
			System.out.println("sb1 과 sb2의 내용은 다르다.");
		}
		if(sb1.toString().equals(sb2.toString())) { //String 객체로 변경 후 내용 비교 가능
			System.out.println("sb1 과 sb2의 내용은 같다.");
		} else {
			System.out.println("sb1 과 sb2의 내용은 다르다.");
		}
	}
}
