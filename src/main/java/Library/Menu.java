package Library;

import java.util.Scanner;
public class Menu {
    String selectMenu() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("### MENU START ###");
        System.out.printf("a) Добавить новую книгу - нажмите A.%nb) Посмотреть инфо по существующей книге по ее id - нажмите B.%nc) Посмотреть инфо по существующей книге по ее названию - нажмите C. %nd) Удалить книгу - нажмите D.%n");
        System.out.println("### MENU END ###");
        String a = scanner.nextLine();
        String S = a.toUpperCase();
        System.out.println(S);
        return S;
    }
}
