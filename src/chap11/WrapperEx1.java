package chap11;
/*
 * Wrapper 클래스 : 8개의 기본자료형을 객체화 하기 위한 클래스
 * 
 *    기본자료형            Wrapper 클래스
 *    boolean       Boolean
 *    byte          Byte
 *    short         Short
 *    int           Integer
 *    long          Long
 *    char          Character
 *    float         Float
 *    double        Double
 *    
 *    기본적으로 기본자료형과 참조자료형 사이의 형변환은 불가
 *    단 예외적으로 기본자료형과 Wrapper클래스간의 형변환은 가능하다.(jdk5.0 이후 부터)
 *    기본자료형 <= 참조자료형 : auto unBoxing
 *    참조자료형 <= 기본자료형 : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100; //auto Boxing
		Integer i2 = 100;
		if(i1 == i2) {   //
			System.out.println("i1 과 i2는 같다.");
		} else {
			System.out.println("i1 과 i2는 다르다.");
		}
		if(i1.equals(i2)) {
			System.out.println("i1 과 i2는 같다.");
		} else {
			System.out.println("i1 과 i2는 다르다.");
		}
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		if(i3 == i4) {
			System.out.println("i3 과 i4는 같다.");
		} else {
			System.out.println("i3 과 i4는 다르다.");
		}
		if(i3.equals(i4)) {
			System.out.println("i3 과 i4는 같다.");
		} else {
			System.out.println("i3 과 i4는 다르다.");
		}
		System.out.println("int 형값의 최대값:"+ Integer.MAX_VALUE);
		System.out.println("int 형값의 최소값:"+ Integer.MIN_VALUE);
		System.out.println("int의 bit 수 :" + Integer.SIZE);
		//byte 형의 최대값,최소값, bit 갯수
		System.out.println("byte 형 값의 최대값:"+ Byte.MAX_VALUE);
		System.out.println("byte 형 값의 최소값:"+ Byte.MIN_VALUE);
		System.out.println("byte의 bit 수 :" + Byte.SIZE);
		
		//정수 문자열을 int로 변환
		int num = Integer.parseInt("123");
		System.out.println("10진수 : " + num);
		num = Integer.parseInt("123",8);
		System.out.println("8진수 : 123 => 10진수 :" + num);
		num = Integer.parseInt("123",16);
		System.out.println("16진수 : 123 => 10진수 :" + num);
		//10진수를 2,8,16진수로 변환
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(83));
		System.out.println(Integer.toHexString(291));
		
		//실수 문자열 float로 변환 
		float f = Float.parseFloat("123.45");
		System.out.println(f+10);
		double d = Double.parseDouble("123.456");
		System.out.println(d+10);
	}
}
