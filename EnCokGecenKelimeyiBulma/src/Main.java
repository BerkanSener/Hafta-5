import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();

        String enCokGecenKelime = enCokGecenKelimeBul(metin);

        System.out.println("En çok geçen kelime: " + enCokGecenKelime);
    }

    private static String enCokGecenKelimeBul(String metin) {
        // Metni kelimelere ayırma
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saymak için HashMap kullanma
        Map<String, Integer> kelimeSayilari = new HashMap<>();

        for (String kelime : kelimeler) {
            // Küçük-büyük harf duyarlı olmayacak şekilde kelimeyi ekleyin
            kelime = kelime.toLowerCase();

            // Eğer kelime zaten HashMap'te varsa, count'u bir artırın; yoksa ekleyin ve count'u 1 yapın
            kelimeSayilari.put(kelime, kelimeSayilari.getOrDefault(kelime, 0) + 1);
        }

        // En çok geçen kelimeyi bulma
        String enCokGecenKelime = null;
        int enCokGecenSayi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > enCokGecenSayi) {
                enCokGecenKelime = entry.getKey();
                enCokGecenSayi = entry.getValue();
            }
        }

        return enCokGecenKelime;
    }
}
