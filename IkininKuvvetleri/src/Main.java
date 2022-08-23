import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= s.nextInt();
        int start=2;
        for(;true;){
            if(start>=sayi){
                break;
            }
            System.out.print(start+", ");
            start*=2;

        }
    }
}
