package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4):" + s.charAt(4)); //5번째 문자 리턴
		//ABCDEFGH - abc = -32 : 정렬관련 메서드 
		System.out.println("s.compareTo('abc'):" + s.compareTo("abc"));
		//IgnoreCase : 대소문자 상관없이.
		System.out.println
		   ("s.compareToIgnoreCase('abcdefgh'):" + s.compareToIgnoreCase("abcdefgh"));
		// concat() : s + "abc" 
		System.out.println("s.concat('abc'):" + s.concat("abc"));
		// s 문자열의 끝의 문자열이 "FGH"?
		System.out.println("s.endsWith('FGH'):" + s.endsWith("FGH"));
		// s 문자열의 시작 문자열이 "ABC"?
		System.out.println("s.startsWith('ABC'):" + s.startsWith("ABC")); 
		System.out.println
		   ("s.equalsIgnoreCase('abcdefgh'):" + s.equalsIgnoreCase("abcdefgh"));
		
		s = "This is a String";
		//indexOf(문자) : 문자의 위치 리턴
		System.out.println("s.indexOf('i'):" + s.indexOf('i')); //2
		System.out.println("s.indexOf('is'):" + s.indexOf("is"));//2
		//indexOf(문자,인덱스) : 문자의 인덱스 이후 부터 찾아서 위치 리턴
		System.out.println("s.indexOf('is',3):" + s.indexOf("is",3));//5
		//lastIndexOf("is") : 뒤쪽 우선으로 위치 리턴. 위치는 앞부터 시작
		System.out.println("s.lastIndexOf('i'):" + s.lastIndexOf("i"));//13
		System.out.println("s.lastIndexOf('is'):" + s.lastIndexOf("is"));//5
		System.out.println("s.length():" + s.length()); //문자열의 길이
		System.out.println("s.replace(is,IS):" + s.replace("is","IS")); //치환
		//substring : 부분문자열
		//s.substring(5) : 5번인덱스 이후부분을 부분 문자열로 리턴
		System.out.println("s.substring(5):" + s.substring(5)); //is a String
		//s.substring(5,13) : 5번인덱스 이후 부터 12번인덱스까지를 부분 문자열로 리턴
		System.out.println("s.substring(5,13):" + s.substring(5,13));//is a Str
		System.out.println("s.toLowerCase():" + s.toLowerCase()); //소문자로
		System.out.println("s.toUpperCase():" + s.toUpperCase()); //대문자로
		
		s = "       문자열의 trim 메서드     ";
		System.out.println("s.trim():" + s.trim()); //양쪽 공백을 제거
		//토큰화 : 의미있는 문자열로 분류.
		s= "HTML,CSS,JavaScript,Java,JSP,Spring";
		String[] subject = s.split(","); //s.split(",") : s문자열을 ,로 나눠서 배열에 저장.
		for(int i=0;i<subject.length;i++) {
			System.out.println((i+1)+":" + subject[i]);
		}
		
		// 문자열 <= 기본형
		s = ""+123;
		s = String.valueOf(123);
		// 기본형 <= 문자열
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("123.5");
		
		//format() : 서식문자를 사용하여 형식화 할 수 있는기능
		s = String.format("%.2f", d);
		System.out.println(s);
		s = String.format("%10d", i);
		System.out.println(s);
	}
}
