package chap11;

/*
 * String 클래스 예제  : 정적 문자열 클래스 : 변경 불가 객체 
 *   클래스 중 유일하게 대입연산자로 객체생성이 가능
 *   클래스 중 유일하게 + 연산자를 사용할 수 있다.
 *   
 * StringBuffer,StringBuilder 클래스 : 동적문자열클래스 : 변경 가능 객체    
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if (s1 == s2)
			System.out.println("s1과  s2는 같은 객체임");
		else
			System.out.println("s1과  s2는 다른 객체임");
		if (s1.equals(s2))
			System.out.println("s1과  s2는 같은 내용임");
		else
			System.out.println("s1과  s2는 다른 내용임");
		String s3 = new String("abc");
		String s4 = new String("abc");
		if (s3 == s4)
			System.out.println("s3과  s4는 같은 객체임");
		else
			System.out.println("s3과  s4는 다른 객체임");
		if (s3.equals(s4))
			System.out.println("s3과  s4는 같은 내용임");
		else
			System.out.println("s3과  s4는 다른 내용임");
	}
}
