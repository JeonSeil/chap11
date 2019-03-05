package chap11;
/*
 * Math 클래스 예제
 * 1. 수치 계산관련 static 메서드와, 상수를 가진 클래스.
 * 2. 객체화 불가. => 생성자의 접근제어자가 private임.
 * 3. final 클래스임. => 상속불가 클래스.
 * 
 * Math.멤버명 으로 호출한다.
 */
public class MathEx1 {
	public static void main(String[] args) {
		//삼각함수
		System.out.println("Math.sin(Math.PI/2):" + Math.sin(Math.PI/2)); //Math.PI/2 라디안
		System.out.println("Math.cos(60):" + Math.cos(Math.toRadians(60)));
		System.out.println("Math.tan(Math.PI/4):" + Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/4) :" + Math.toDegrees(Math.PI/4));
		//제곱근,제곱
		System.out.println("Math.sqrt(25) :" + Math.sqrt(25));
		System.out.println("Math.pow(5,3) :" + Math.pow(5,3)); //5 * 5 * 5
		//근사 정수
		System.out.println("Math.ceil(3.4) :" + Math.ceil(3.4)); //3.4보다 큰 근사정수, 4
		System.out.println("Math.ceil(-3.4) :" + Math.ceil(-3.4)); //-3.4보다 큰 근사정수, -3
		System.out.println("Math.floor(3.4) :" + Math.floor(3.4)); //3.4보다 작은 근사정수, 3
		System.out.println("Math.floor(-3.4) :" + Math.floor(-3.4)); //-3.4보다 작은 근사정수, -4
		System.out.println("Math.rint(3.4) :" + Math.rint(3.4)); //3.4의 근사정수, 3
		System.out.println("Math.rint(-3.4) :" + Math.rint(-3.4)); //-3.4의 근사정수, -3
		//반올림
		System.out.println("Math.round(3.7):" + Math.round(3.7));
		//절대값
		System.out.println("Math.abs(-3.4) :" + Math.abs(-3.4));
		//큰값,작은값
		System.out.println("Math.max(3,4) :" + Math.max(3,4));
		System.out.println("Math.min(3,4) :" + Math.min(3,4));
		//임의의 수
		System.out.println("Math.random() :" + Math.random());
	}
}
