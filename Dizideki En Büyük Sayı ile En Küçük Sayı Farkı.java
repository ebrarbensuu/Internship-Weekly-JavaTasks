public class Görev2 {
    public static void main(String[] args) {
        int[] sayilar = {4, 8, 12, 16, 20};
        int enbuyuksayi = sayilar[0];
        int enkucuksayi = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > enbuyuksayi) {
                enbuyuksayi = sayilar[i];
            }
            if (sayilar[i] < enkucuksayi) {
                enkucuksayi = sayilar[i];
            }
        }
        int fark = enbuyuksayi - enkucuksayi;
        System.out.println("En Büyük Sayı: " + enbuyuksayi);
        System.out.println("En Küçük Sayı: " + enkucuksayi);
        System.out.println("Sayıların Farkı: " + fark);
    }
}