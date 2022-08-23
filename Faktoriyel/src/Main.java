import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Sayı giriniz: ");
        Scanner s = new Scanner(System.in);
        int sayi =s.nextInt();
        int fact=1;
        for(int i=1;i<=sayi;i++){
            fact*=i;
        }
        System.out.println("Faktoriyel: "+fact);
    }
}
