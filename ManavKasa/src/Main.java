import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Armut kg giriniz: ");
        double armut = s.nextDouble();
        System.out.println("elma kg giriniz: ");
        double elma = s.nextDouble();
        System.out.println("domates kg giriniz: ");
        double domates = s.nextDouble();
        System.out.println("muz kg giriniz: ");
        double muz = s.nextDouble();
        System.out.println("patlıcan kg giriniz: ");
        double patlıcan = s.nextDouble();
        System.out.println("Toplam tutar: "+toplam(armut,elma,domates,muz,patlıcan)+" liradır.");
    }
    public static double toplam (double armut,double elma,double domates,double muz,double patlıcan){
        return armut*2.14 + elma*3.67 +domates*1.11+muz*0.95+patlıcan*5;
    }
}
