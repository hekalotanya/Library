package Library;

import java.util.Scanner;
public class Menu {
    String selectMenu() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("### MENU START ###");
        System.out.printf("a) �������� ����� ����� - ������� A.%nb) ���������� ���� �� ������������ ����� �� �� id - ������� B.%nc) ���������� ���� �� ������������ ����� �� �� �������� - ������� C. %nd) ������� ����� - ������� D.%n");
        System.out.println("### MENU END ###");
        String a = scanner.nextLine();
        String S = a.toUpperCase();
        System.out.println(S);
        return S;
    }
}