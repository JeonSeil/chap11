package chap11;
/*
 * StringBuffer 클래스의 주요 메서드
 * 1. 동적인 문자열. => 문자 추가시 객체 자체에 추가됨.
 * 2. String 클래스의 보조역할기능
 * 3. StringBuilder 클래스와 모든 메서드가 동일하다. => jdk5.0 이후 추가된 클래스. 
 *    StringBuffer  : 멀티스레드환경 : Thread에 safe 함.  
 *    StringBuilder : 싱글스레드환경 : Thread에 unsafe 함.
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append(true);
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.insert(5, "@@");
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
