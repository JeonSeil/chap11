package chap11;
/*
 * indexOf(문자열,인덱스) : 문자열이 존재 하면 리턴값이 0 이상. 
 *                  문자열이 없으면 리턴값이 -1 이상. 
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12")); //2
		System.out.println(count("12345AB12AB345AB","AB")); //3
		System.out.println(count("12345","6")); //0
	}
	private static int count(String string, String string2) {
		int index = 0;
		int count = 0;
		while(true) {
			index = string.indexOf(string2, index);
			if(index >= 0) {
				index++;
				count++;
			} else {
				break;
			}
		}		
		return count;
	}
}
