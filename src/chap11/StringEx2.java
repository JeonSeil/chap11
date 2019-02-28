package chap11;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4):" + s.charAt(4)); //5��° ���� ����
		//ABCDEFGH - abc = -32 : ���İ��� �޼��� 
		System.out.println("s.compareTo('abc'):" + s.compareTo("abc"));
		//IgnoreCase : ��ҹ��� �������.
		System.out.println
		   ("s.compareToIgnoreCase('abcdefgh'):" + s.compareToIgnoreCase("abcdefgh"));
		// concat() : s + "abc" 
		System.out.println("s.concat('abc'):" + s.concat("abc"));
		// s ���ڿ��� ���� ���ڿ��� "FGH"?
		System.out.println("s.endsWith('FGH'):" + s.endsWith("FGH"));
		// s ���ڿ��� ���� ���ڿ��� "ABC"?
		System.out.println("s.startsWith('ABC'):" + s.startsWith("ABC")); 
		System.out.println
		   ("s.equalsIgnoreCase('abcdefgh'):" + s.equalsIgnoreCase("abcdefgh"));
		
		s = "This is a String";
		//indexOf(����) : ������ ��ġ ����
		System.out.println("s.indexOf('i'):" + s.indexOf('i')); //2
		System.out.println("s.indexOf('is'):" + s.indexOf("is"));//2
		//indexOf(����,�ε���) : ������ �ε��� ���� ���� ã�Ƽ� ��ġ ����
		System.out.println("s.indexOf('is',3):" + s.indexOf("is",3));//5
		//lastIndexOf("is") : ���� �켱���� ��ġ ����. ��ġ�� �պ��� ����
		System.out.println("s.lastIndexOf('i'):" + s.lastIndexOf("i"));//13
		System.out.println("s.lastIndexOf('is'):" + s.lastIndexOf("is"));//5
		System.out.println("s.length():" + s.length()); //���ڿ��� ����
		System.out.println("s.replace(is,IS):" + s.replace("is","IS")); //ġȯ
		//substring : �κй��ڿ�
		//s.substring(5) : 5���ε��� ���ĺκ��� �κ� ���ڿ��� ����
		System.out.println("s.substring(5):" + s.substring(5)); //is a String
		//s.substring(5,13) : 5���ε��� ���� ���� 12���ε��������� �κ� ���ڿ��� ����
		System.out.println("s.substring(5,13):" + s.substring(5,13));//is a Str
		System.out.println("s.toLowerCase():" + s.toLowerCase()); //�ҹ��ڷ�
		System.out.println("s.toUpperCase():" + s.toUpperCase()); //�빮�ڷ�
		
		s = "       ���ڿ��� trim �޼���     ";
		System.out.println("s.trim():" + s.trim()); //���� ������ ����
		//��ūȭ : �ǹ��ִ� ���ڿ��� �з�.
		s= "HTML,CSS,JavaScript,Java,JSP,Spring";
		String[] subject = s.split(","); //s.split(",") : s���ڿ��� ,�� ������ �迭�� ����.
		for(int i=0;i<subject.length;i++) {
			System.out.println((i+1)+":" + subject[i]);
		}
		
		// ���ڿ� <= �⺻��
		s = ""+123;
		s = String.valueOf(123);
		// �⺻�� <= ���ڿ�
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("123.5");
		
		//format() : ���Ĺ��ڸ� ����Ͽ� ����ȭ �� �� �ִ±��
		s = String.format("%.2f", d);
		System.out.println(s);
		s = String.format("%10d", i);
		System.out.println(s);
	}
}
