import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Taban: ");
        Scanner s = new Scanner(System.in);
        int taban=s.nextInt();
        System.out.println("Üs: ");
        int us = s.nextInt();
        System.out.println(Math.pow(taban,us));
    }
}
