package test0304;

/*
 * ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
 * �޼���� : fillZero
 * ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���
 *        �����, ���� �� ������ 0���� ä���.
 *        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰�
 *        length�� ���� ������ �״�� ��ȯ�Ѵ�.
 *        ���� �־��� length�� ���� 0�� ���ų�, 
 *        ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : String
 * �Ű����� : String src, int length
 * 
 [���]
0000012345

123
null
 */
public class Test4 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
		System.out.println(fillZero(null, 3));
	}

	private static String fillZero(String src, int length) {
		if(src==null) return src;
		if(length <= 0) return "";
		if(src.length() >= length) return src.substring(0,length);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++) {
			sb.append(0);
		}
		sb.replace(length-src.length(), length, src);
		return sb.toString();
	}
}