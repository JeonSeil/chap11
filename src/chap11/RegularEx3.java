package chap11;

import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		//���Խ����� ǥ���ϱ�. 
		String tel = "010-123-4567";
//		String pattern ="010-123-4567"; 
//		String pattern ="0\\d{1,2}-\\d{3}-\\d{4}"; 
		String pattern ="0[0-9]{1,2}-[0-9]{3}-[0-9]{4}"; 
		if(Pattern.matches(pattern,tel)) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}
				
	}
}
