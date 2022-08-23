import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int km,age,isOneWay;

    Scanner s = new Scanner(System.in);
        System.out.println("Mesafe giriniz (km): ");
        km=s.nextInt();
        System.out.println("Yaş giriniz : ");
        age=s.nextInt();
        System.out.println("tek yön ise 1,gidiş geliş ise 2'yi tuşlayınız: ");
        isOneWay=s.nextInt();
        double totalPrice =km*0.1;
        if(age<12){
            totalPrice/=2;
        }else if(age>=12&&age<24){
            totalPrice*=0.9;
        }else if (age>=65){
            totalPrice*=0.7;
        }
        if(isOneWay==2){
            totalPrice=totalPrice*2*0.8;
        }
        System.out.println("Toplam tutar: "+totalPrice+" liradır.");
    }
}
