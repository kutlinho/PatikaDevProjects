import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int yil= s.nextInt();
        if(yil%4==0){
            if(yil%100==0 && yil%400!=0){
                System.out.println("Artık yıl değildir.");
            }else{
                System.out.println("Artık yıldır.");
            }
        }else{
            System.out.println("Artık yıldır.");
        }
    }
}
