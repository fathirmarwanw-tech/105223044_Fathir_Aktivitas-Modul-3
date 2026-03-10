import java.util.Scanner;

public class ValidasiPIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pinBenar = 123456;
        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN: ");
            int pin = input.nextInt();

            if (pin == pinBenar) {
                System.out.println("Login berhasil");
                break;
            } else {
                System.out.println("PIN salah");
            }

            percobaan++;
        }

        if (percobaan == 3) {
            System.out.println("Akun Diblokir");
        }
    }
}
