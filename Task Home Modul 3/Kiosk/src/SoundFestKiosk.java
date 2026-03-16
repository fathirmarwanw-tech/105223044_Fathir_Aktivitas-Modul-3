import java.util.Scanner;

public class SoundFestKiosk {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vipStock = 5;
        int festivalStock = 25;
        int tribuneStock = 35;

        int vipPrice = 1500000;
        int festivalPrice = 800000;
        int tribunePrice = 500000;

        int menu;

        do {
            System.out.println("\n=== UNIVERSITAS PERTAMINA SOUNDFEST 2026 ===");
            System.out.println("1. VIP | Harga: Rp" + vipPrice + " | Stok: " + vipStock);
            System.out.println("2. Festival | Harga: Rp" + festivalPrice + " | Stok: " + festivalStock);
            System.out.println("3. Tribune | Harga: Rp" + tribunePrice + " | Stok: " + tribuneStock);
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            if(menu == 4){
                System.out.println("Mesin dimatikan teknisi.");
                break;
            }

            int jumlah;
            int stok = 0;
            int harga = 0;
            int minUsia = 0;

            switch(menu){

                case 1:
                    stok = vipStock;
                    harga = vipPrice;
                    minUsia = 18;
                    break;

                case 2:
                    stok = festivalStock;
                    harga = festivalPrice;
                    minUsia = 15;
                    break;

                case 3:
                    stok = tribuneStock;
                    harga = tribunePrice;
                    minUsia = 0;
                    break;

                default:
                    System.out.println("Menu tidak ada.");
                    continue;
            }

            System.out.print("Jumlah tiket: ");
            jumlah = input.nextInt();

            if(jumlah > stok){
                System.out.println("Stok tidak mencukupi.");
                continue;
            }

            int berhasil = 0;
            int total = 0;
            boolean batal = false;

            for(int i=1;i<=jumlah;i++){

                int usia;

                while(true){
                    System.out.print("Masukkan usia tiket ke-" + i + " (-1 untuk batal): ");
                    usia = input.nextInt();

                    if(usia == -1){
                        batal = true;
                        break;
                    }

                    if(usia <=0 || usia >120){
                        System.out.println("Usia tidak logis.");
                    } else {
                        break;
                    }
                }

                if(batal){
                    System.out.println("Transaksi dibatalkan.");
                    break;
                }

                if(usia < minUsia){
                    System.out.println("Tidak memenuhi syarat usia.");
                    continue;
                }

                berhasil++;
                total += harga;
            }

            if(!batal){

                System.out.println("\n=== NOTA ===");
                System.out.println("Tiket berhasil: " + berhasil);
                System.out.println("Total bayar: Rp" + total);

                if(menu == 1){
                    vipStock -= berhasil;
                }
                else if(menu == 2){
                    festivalStock -= berhasil;
                }
                else if(menu == 3){
                    tribuneStock -= berhasil;
                }
            }

        } while(true);

    }
}
