package chap11;
/*
 * StringBuffer Ŭ���� ����
 * 1. ���� ���ڿ�.
 * 2. equals �޼��尡 �������̵� �Ǿ� ���� ���� => ����񱳸� ���ؼ��� String ���� ���� �� ����񱳸� �ؾ� ��
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer  sb1 = new StringBuffer("abc");
		StringBuffer  sb2 = new StringBuffer("abc");
		if(sb1.equals(sb2)) {
			System.out.println("sb1 �� sb2�� ������ ����.");
		} else {
			System.out.println("sb1 �� sb2�� ������ �ٸ���.");
		}
		if(sb1.toString().equals(sb2.toString())) { //String ��ü�� ���� �� ���� �� ����
			System.out.println("sb1 �� sb2�� ������ ����.");
		} else {
			System.out.println("sb1 �� sb2�� ������ �ٸ���.");
		}
	}
}