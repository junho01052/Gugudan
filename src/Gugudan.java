import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {

		// 8,9��
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + number);
		
		if (number < 2) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else if (number > 9) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else {		
		for(int i = 1; i < 10; i++) {
			System.out.println(number * i);
		}
		}
	}
}