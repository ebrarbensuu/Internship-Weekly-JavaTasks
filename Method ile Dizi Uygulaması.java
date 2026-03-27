public class OrtalamaHesaplama {

    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};
        double sonuc = ortalama(sayilar);
        System.out.println("Dizinin Ortalaması: " + sonuc);
    }
    public static double ortalama(int[] dizi) {
        if (dizi.length == 0) {
            return 0.0;
        }
        double toplam = 0;
        for (int sayi : dizi) {
            toplam += sayi;
        }
        return toplam / dizi.length;
    }
}