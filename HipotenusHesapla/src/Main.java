import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("İlk dik kenarı giriniz: ");
        Scanner s = new Scanner(System.in);
        double kenar1 = s.nextDouble();
        System.out.println("İkinci dik kenarı giriniz: ");
        double kenar2 = s.nextDouble();

        System.out.println("Hipotenüs = "+Math.sqrt(kenar1*kenar1 + kenar2*kenar2));
    }
}
