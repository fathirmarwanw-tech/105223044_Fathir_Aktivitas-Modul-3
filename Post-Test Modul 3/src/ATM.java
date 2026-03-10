import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int saldo = 500000;
        int jumlah;

        do {
            System.out.println();
            System.out.println("=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Saldo anda: Rp" + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setor: ");
                    jumlah = input.nextInt();
                    saldo += jumlah;
                    System.out.println("Setor berhasil. Saldo sekarang: Rp" + saldo);
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tarik: ");
                    jumlah = input.nextInt();

                    if (saldo - jumlah >= 50000) {
                        saldo -= jumlah;
                        System.out.println("Penarikan berhasil. Saldo sekarang: Rp" + saldo);
                    } else {
                        System.out.println("Gagal. Saldo minimal harus Rp50000.");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari ATM.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 4);

    }
}
