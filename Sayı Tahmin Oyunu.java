import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Random rastgele = new Random();
        int tutulanSayi = rastgele.nextInt(100);
        int tahmin = 0;
        System.out.println("1 ile 100 arasında bir sayı tuttum. Hadi tahmin et!");
        while (tahmin != tutulanSayi) {
            System.out.print("Tahminin: ");
            tahmin = klavye.nextInt();
            if (tahmin < tutulanSayi) {
                System.out.println("Daha büyük bir sayı söyle!");
            } else if (tahmin > tutulanSayi) {
                System.out.println("Daha küçük bir sayı söyle!");
            } else {
                System.out.println("Tebrikler! Bildin.");
            }
        }
    }
}