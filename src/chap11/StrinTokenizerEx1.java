package chap11;

import java.util.StringTokenizer;

public class StrinTokenizerEx1 {
	public static void main(String[] args) {
		String text = "홍길동/이수홍//박연수";
		StringTokenizer st = new StringTokenizer(text,"/");
		int cnt = st.countTokens(); //현재 남아있는 토큰의 갯수
		for(int i=0;i < cnt;i++) {
			System.out.println(st.nextToken()); //토큰 한개를 꺼내기.
		}
		System.out.println();
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {  //다음 토큰 존재?
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println("split() 메서드 이용하기.");
		String[] tarr = text.split("/");
		for(int i=0;i<tarr.length;i++) {
			System.out.println(tarr[i]);
		}
	}
}
