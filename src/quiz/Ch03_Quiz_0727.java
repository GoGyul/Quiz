package quiz;

public class Ch03_Quiz_0727 {

	public static void main(String[] args) {
		
		byte b =5;
//		b = -b; // byte -b�� ���� �Ұ�
		int result = 10 /b;
		System.out.println(result);
		
		
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); //31
		
		
		
		boolean stop = true;
		while (stop) {
			break;
		}
		System.out.println(stop);
		
		
		
		int pencils = 32;
		int student =30;
		int n = pencils/student;
		int m = pencils%student;
		
		int pencilsPerStudent = (n);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (m);
		System.out.println(pencilsLeft);
		
		
		
		int var1 =5;
		int var2 =2;
		double var3 =  var1/var2; // double �� ������ �ʾƼ� ��°��� 4���ȴ�, (double) �� �����־����.
		int var4 = (int) (var3*var2);
		System.out.println(var4);

		
		
		int value = 356;
		System.out.println((byte)value);
		
		
		
		float f1 = 10f;
		float f2 = f1/100; // �纯�� double�� ������. float�� 0.1�� double�� 0.1�� �̼��ϰ� ���̰���
		if(f2 == 0.1) {
			System.out.println("10%�Դϴ�.");
		}else {
			System.out.println("10%�� �ƴմϴ�.");
		}
		
		
		
		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ();
//		System.out.println(area);
		
		
		
		
		
		
	}

}
