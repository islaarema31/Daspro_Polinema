import java.util.Scanner;
public class ContohVariable {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        int gajiPokok, penjualan;
        double komisi = 0.15, gajiDiTerima;
        System.out.println("Masukan gaji pokok Pak Edi : ");
        gajiPokok = scan.nextInt();
        System.out.println("Masukan jumlah penjualan : ");
        penjualan = scan.nextInt();
        gajiDiTerima = penjualan * komisi + gajiPokok;
        System.out.println("Gaji yang diterima Pak Edi : " + gajiDiTerima);
}
}