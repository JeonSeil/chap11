package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 해당월의 달력 출력하기
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		System.out.println("월를 입력하세요");
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //입력월의 1일을 설정.
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //입력월의 1일의 요일 값 (1(일) ~ 7(토))
		int lastday = cal.getActualMaximum(Calendar.DATE); //입력월의 마지막일자.
		//%4s : "일" : 일문자열을 4자리로 출력
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n",
				"일","월","화","수","목","금","토");
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
