import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Diziyi manuel olarak tanımla
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Kullanıcıdan indeksi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin (0-9 arası): ");
        int indeks = scanner.nextInt();

        // Metodu çağır ve sonucu yazdır
        try {
            int sonuc = elemaniGetir(dizi, indeks);
            System.out.println("Belirtilen indeksteki eleman: " + sonuc);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz indeks! Dizi boyutunu aşmayan bir indeks giriniz.");
        }
    }

    // Metodu tanımla
    public static int elemaniGetir(int[] dizi, int indeks) {
        // Belirtilen indeksteki elemanı döndür
        return dizi[indeks];
    }
}
