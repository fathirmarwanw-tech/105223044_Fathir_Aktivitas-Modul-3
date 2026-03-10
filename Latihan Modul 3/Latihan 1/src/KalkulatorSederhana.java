import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Angka kedua: ");
        double b = input.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Error: Pembagian dengan 0 tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
