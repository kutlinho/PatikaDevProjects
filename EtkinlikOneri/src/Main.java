import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        int sicaklik = s.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak");
        }
        else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinema");
        }
        else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik");
        }
        else{
            System.out.println("Yüzme");
        }
    }
}
