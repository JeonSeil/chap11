package chap11;

/*
 * getRand()�޼��� �����ϱ�.
 *   �־��� ����(-3 ~ 1) �� ���� ������ �������� ��ȯ. ���� ��谪�� ��� ������ ���Ե�.
 *   �ΰ��� ���ڴ� ������� Ŀ�� ��� ����. 
 *   ��ȯ Ÿ�� : int
 *   
 *   Math.random() �Լ��̿��ϱ�.
 */
public class MathEx2 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-10, 3) + ",");
		}
		System.out.println();
	}

	private static int getRand(int i, int j) {
		int max = Math.max(i, j);
		int min = Math.min(i, j);

		int result = (int) (Math.random() * ((max - min) + 1)) + min;
		return result;
	}
}