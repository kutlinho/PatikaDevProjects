import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.println("1-Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        int secim = scanner.nextInt();
        int sonuc =calculator(a,b,secim);
        System.out.println("Sonuç = "+sonuc);
    }
    public static int calculator(int sayi1,int sayi2,int secim){
        int sonuc=0;
        switch (secim){
            case 1:
                sonuc =sayi1+sayi2;
                break;
            case 2:
                sonuc= sayi1-sayi2;
                break;

            case 3:
                sonuc= sayi1*sayi2;
                break;
            case 4:
                sonuc= sayi1/sayi2;
                break;
        }
        return sonuc;
    }
}
