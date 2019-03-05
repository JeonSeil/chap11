package chap11;

import java.util.StringTokenizer;

public class StrinTokenizerEx1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ//�ڿ���";
		StringTokenizer st = new StringTokenizer(text,"/");
		int cnt = st.countTokens(); //���� �����ִ� ��ū�� ����
		for(int i=0;i < cnt;i++) {
			System.out.println(st.nextToken()); //��ū �Ѱ��� ������.
		}
		System.out.println();
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {  //���� ��ū ����?
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println("split() �޼��� �̿��ϱ�.");
		String[] tarr = text.split("/");
		for(int i=0;i<tarr.length;i++) {
			System.out.println(tarr[i]);
		}
	}
}
