package test0304;

/*
 * 다음과 같은 실행 결과를 얻도록 SutdaCard클래스를 구현하시오
 * [결과]
 * c1=3K
 * c2=3K
 * c1.equals(c2) : true
 */
public class Test1 {
 public static void main(String[] args) {
  SutdaCard c1 = new SutdaCard(3,true);
  SutdaCard c2 = new SutdaCard(3,true);
  
  System.out.println("c1=" + c1);//3K
  System.out.println("c2=" + c2);//3K
  System.out.println("c1.equals(c2) : "  + c1.equals(c2));
 }
}
class SutdaCard {
	int number;
	boolean isKwang;
	public SutdaCard(int number, boolean isKwang) {
		super();
		this.number = number;
		this.isKwang = isKwang;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard s = (SutdaCard)obj;
			return number==s.number&&isKwang==s.isKwang;
		}
		return false;
	}
	@Override
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
	
}