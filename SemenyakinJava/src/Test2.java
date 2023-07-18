import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Введите имя и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String name = "Вячеслав";
        if (userInput.equalsIgnoreCase(name)) {
            System.out.println("Привет Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        scanner.close();
    }
}
