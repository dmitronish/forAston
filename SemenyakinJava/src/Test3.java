import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Введите размер числового массива и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        System.out.println("Введите " + number + " чисел и после каждой цифры нажмите Enter");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введенный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");

        System.out.print("Элементы массива кратные 3 - [");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(" " + array[i] + " ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
