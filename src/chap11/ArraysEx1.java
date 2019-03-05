package chap11;

import java.util.Arrays;

/*
 * Arrays 클래스 예제 : 배열의 복사, 비교, 정렬 등 기능을 포함하고 있는 클래스
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"월매","이몽룡","향단","방자"};
		for(String s : arr1) System.out.print(s + ",");
		System.out.println();
		Arrays.fill(arr1, "성춘향");
		for(String s : arr1) System.out.print(s + ",");
		System.out.println();
		Arrays.fill(arr1,1,3, "춘향전");
		for(String s : arr1) System.out.print(s + ",");
		System.out.println();
		//문제 : 정수형 배열 100개의 방을 가진 배열을 생성하여, 모든 값을 100으로 저장하기
		int[] intArr = new int[100];
		Arrays.fill(intArr, 100);
		for(int i : intArr) System.out.print(i + ",");
		System.out.println();
		String[] arr2 = {"월매","이몽룡","향단","방자"};
		Arrays.sort(arr2);  //정렬하기.
		for(String s : arr2) System.out.print(s + ",");
		System.out.println();
		
	}
}
