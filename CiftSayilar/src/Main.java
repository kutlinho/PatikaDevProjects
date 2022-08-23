import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=s.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i%2==1){
                continue;
            }
            System.out.print(i+", ");

        }
    }
}
