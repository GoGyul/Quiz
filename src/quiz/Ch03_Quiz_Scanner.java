package quiz;
import java.util.Scanner;

public class Ch03_Quiz_Scanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̵�:");
		String name = scanner.nextLine();
		
		System.out.println("�н�����:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		
		
		
		if(name.equals("java")) { //name.equals
			if(password == 12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ���� �н����尡 Ʋ��");
			}
		}else {
			System.out.println("�α��� ���� ���̵� �ٸ�");
		}

	}

}
