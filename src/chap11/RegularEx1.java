package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���� ǥ���� ���� : ������ ������ �����Ͽ� ������ �� �ִ� ���
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","car","combat",
				"count","cTT","data","disk","c"};
		/*
		 * c[a-z]* : ù��° ���ڰ� c�̸鼭 �������ڰ� [a-z] �ҹ��ڰ� * 0���̻��� ���ڿ� ���� 
		 * ���� : c�������Ŀ� �빮��,�ҹ��ڰ� ������ �ü� �ְ�, �Ǵ� ��� ��.
		 */
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for(String s : data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s + ",");
			}
		}
		System.out.println();
		String names = "ȫ�浿,   ���,�̸���    ,    ������  ,   �Ӳ���";
		//\\s*,\\s* :  \\s : ���� ,  * :0���̻�  , �� �����ϱ�
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr) {
			System.out.println(s);
		}
	}
}