import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Boy giriniz(m): ");
        Scanner s = new Scanner(System.in);
        double boy = s.nextDouble();
        System.out.println("Kilo giriniz(m): ");
        int kg = s.nextInt();
        System.out.println("Vücut kitle endeksi: "+bmi(boy,kg));
    }
    public static double bmi(double boy,int kg){
        return kg/(boy*boy);
    }
}
