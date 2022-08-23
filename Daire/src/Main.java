import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Daire'nin yarıçapını giriniz: ");
        Scanner s = new Scanner(System.in);
        double yaricap = s.nextDouble();
        System.out.println("Dairenin alanı: "+alan(yaricap)+"\nÇevresi: "+cevre(yaricap));
    }
    public static double alan(double yaricap){
        return 3.14*2*yaricap;
    }
    public static double cevre(double yaricap){
        return 3.14*yaricap*yaricap;
    }
}
