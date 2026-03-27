import java.util.Scanner;

public class Görev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin Giriniz:");
        String metin = scanner.nextLine();

        int karaktersayisi = metin.length();
        int bosluksayisi = 0;
        int sesliharfsayisi = 0;
        String sesliharfler = "aeıioöuü";
        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);
            if (c == ' ') {
                bosluksayisi++;
            }
            if (sesliharfler.indexOf(c) != -1) {
                sesliharfsayisi++;
            }
        }
        System.out.println("Karakter Sayısı: " + karaktersayisi);
        System.out.println("Boşluk Sayısı: " + bosluksayisi);
        System.out.println("Sesli Harf Sayısı: " + sesliharfsayisi);
    }
}