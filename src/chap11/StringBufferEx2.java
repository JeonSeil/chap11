package chap11;
/*
 * StringBuffer Ŭ������ �ֿ� �޼���
 * 1. ������ ���ڿ�. => ���� �߰��� ��ü ��ü�� �߰���.
 * 2. String Ŭ������ �������ұ��
 * 3. StringBuilder Ŭ������ ��� �޼��尡 �����ϴ�. => jdk5.0 ���� �߰��� Ŭ����. 
 *    StringBuffer  : ��Ƽ������ȯ�� : Thread�� safe ��.  
 *    StringBuilder : �̱۽�����ȯ�� : Thread�� unsafe ��.
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