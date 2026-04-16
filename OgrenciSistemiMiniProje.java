import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciSistemiMiniProje {
    static ArrayList<String> isimler = new ArrayList<>();
    static ArrayList<Double> notlar = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean calisirdurumda = true;

        System.out.println(" Öğrenci Not Sistemine Hoş Geldiniz");
        while (calisirdurumda) {
            menuGoster();
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    ogrenciEkle();
                    break;
                case 2:
                    ogrencileriListele();
                    break;
                case 3:
                    analizYap();
                    break;
                case 4:
                    System.out.println("Programdan Çıkış Yapıldı");
                    calisirdurumda = false;
                    break;
                default:
                    System.out.println("Hatalı Seçim! Lütfen 1-4 Arası Bir Seçim Yapınız");


            }

        }
    }

    private static void menuGoster() {
        System.out.println(" 1-Ekle | 2-Listele | 3-Analiz Et | 4-Çıkış ");
        System.out.println("Seçiminiz: ");


    }

    private static void ogrenciEkle() {
        System.out.println("Öğrenci Adı-Soyadı: ");
        String isim = scanner.nextLine();

        System.out.println("Öğrenci Notu: ");
        double not = scanner.nextDouble();

        isimler.add(isim);
        notlar.add(not);
        System.out.println("Kayıt Başarılı!");
    }

    private static void ogrencileriListele() {
        if (isimler.isEmpty()) {
            System.out.println("Sistemde öğrenci yok!");
            return;
        }

    }

    private static void analizYap() {
        if (notlar.isEmpty()) {
        System.out.println("Not girişi yok!");
        return;

    }

    double toplam = 0;
    double enYuksek = notlar.get(0);
    double enDusuk = notlar.get(0);

    for ( double n : notlar) {
        toplam += n;
        if (n < enDusuk) enDusuk = n;
        if (n > enYuksek) enYuksek = n;
    }
    double ortalama = toplam / notlar.size();

        System.out.println("Ortalama: " + ortalama);
        System.out.println("En Yüksek: " + enYuksek  );
        System.out.println("En Düşük: " + enDusuk );
    }
}