package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �⵵�� ���� �Է¹޾Ƽ� �ش���� �޷� ����ϱ�
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //�Է¿��� 1���� ����.
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //�Է¿��� 1���� ���� �� (1(��) ~ 7(��))
		int lastday = cal.getActualMaximum(Calendar.DATE); //�Է¿��� ����������.
		//%4s : "��" : �Ϲ��ڿ��� 4�ڸ��� ���
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n",
				"��","��","ȭ","��","��","��","��");
//		int day = 1;
//		for(int i=1;day<=lastday;i++) {
//			if(i < firstWeek) {
//				System.out.printf("%3s"," ");
//			} else {
//				System.out.printf("%3d",day);
//				day++;
//			}
//			if(i%7==0) {
//				System.out.println();
//			}
//		}
		for(int i=1,day=1;day<=lastday;i++) {
			if(i < firstWeek) System.out.printf("%3s"," ");
			else 			System.out.printf("%3d",day++);
			if(i%7==0)		System.out.println();
		}

	}
}
