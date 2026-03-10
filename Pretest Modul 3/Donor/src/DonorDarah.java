import java.util.Scanner;

public class DonorDarah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = sc.nextInt();

        System.out.print("Masukkan berat badan (kg): ");
        float berat = sc.nextFloat();

        System.out.print("Masukkan kadar hemoglobin (g/dL): ");
        float hb = sc.nextFloat();

        if (usia >= 17 && usia <= 60) {
            if (berat >= 45) {
                if (hb >= 12.5) {
                    System.out.println("Selamat, kamu layak menjadi donor darah.");
                } else {
                    System.out.println("Maaf, kadar hemoglobinmu kurang dari 12.5 g/dL.");
                }
            } else {
                System.out.println("Maaf, berat badanmu kurang dari 45 kg.");
            }
        } else {
            System.out.println("Maaf, usia harus antara 17 sampai 60 tahun.");
        }

        sc.close();
    }
}

