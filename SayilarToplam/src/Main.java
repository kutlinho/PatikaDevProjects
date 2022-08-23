import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int toplam = 0;
        for (; true; ) {
            System.out.print("Sayı giriniz: ");
            int sayi = s.nextInt();
            if (sayi % 2 == 1) {
                break;
            }
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Sayıların toplamı: "+toplam);
    }
}
