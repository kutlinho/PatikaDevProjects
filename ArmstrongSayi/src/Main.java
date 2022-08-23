import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=s.nextInt();
        int sayi1=sayi;
        String sayiStr =Integer.toString(sayi);
        int toplam =0;
        for(;true;){
            if(sayi1<1){
                break;
            }
            toplam+=Math.pow(sayi1%10,sayiStr.length());
            sayi1=sayi1/10;
        }
        if(toplam==sayi){
            System.out.println("Armstrong Sayısıdır.");
        }else{
            System.out.println("Armstrong sayısı değildir.");
        }
    }
}
