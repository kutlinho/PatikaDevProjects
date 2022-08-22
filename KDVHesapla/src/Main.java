import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bir para miktarı giriniz: ");
        Scanner s = new Scanner(System.in);
        double sayi = s.nextInt();
        double kdv;
        if(sayi>1000){
            kdv=0.08;
        }else{
            kdv=0.18;
        }
        sayi=sayi+sayi*kdv;
        System.out.println("KDV tutarı = "+kdv+"\nKDV'li fiyat = "+sayi);
    }
}
