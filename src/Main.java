import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("introduce 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nnúmero\tcuadrado\tcubo");
        for (int i = 0; i < 20; i++) {
            int number = numbers[i];
            int square = number * number;
            int cube = number * number * number;
            System.out.println(number + "\t" + square + "\t\t" + cube);
        }
        scanner.close();
    }
}
