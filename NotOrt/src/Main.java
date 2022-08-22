import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int toplam=0;
        System.out.println("Matematik notunuzu giriniz: ");
        toplam +=s.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        toplam +=s.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        toplam +=s.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        toplam +=s.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        toplam +=s.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        toplam +=s.nextInt();

        double ort = toplam /6;
        String sart = (ort>=60 ? "Geçti" : "Kaldı") ;
        System.out.println("Ortalama: "+ort);
        System.out.println(sart);
    }
}
