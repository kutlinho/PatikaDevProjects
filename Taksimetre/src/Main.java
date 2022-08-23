import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gidilen mesafeyi giriniz: ");
        Scanner s = new Scanner(System.in);
        double km = s.nextDouble();
        System.out.println("Toplam tutar: "+hesapla(km));
    }
    public static double hesapla(double km){
        double tutar = km*2.20 + 10;
        if(tutar<20){
            return 20;
        }
        else{
            return tutar;
        }
    }
}
