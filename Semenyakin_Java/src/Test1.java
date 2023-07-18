import java.util.Scanner;

public class Test1 {
    public Test1() {
    }

    public static void main(String[] args) {
        System.out.println("Введите число и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Вы ввели число " + number);
        }

        scanner.close();
    }
}
