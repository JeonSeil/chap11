package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 예제 : 문자의 형식을 지정하여 선택할 수 있는 기능
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","car","combat",
				"count","cTT","data","disk","c"};
		/*
		 * c[a-z]* : 첫번째 문자가 c이면서 다음문자가 [a-z] 소문자가 * 0개이상인 문자열 선택 
		 * 문제 : c문자이후에 대문자,소문자가 여러개 올수 있고, 또는 없어도 됨.
		 */
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for(String s : data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s + ",");
			}
		}
		System.out.println();
		String names = "홍길동,   김삿갓,이몽룡    ,    성춘향  ,   임꺽정";
		//\\s*,\\s* :  \\s : 공백 ,  * :0개이상  , 로 구분하기
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr) {
			System.out.println(s);
		}
	}
}