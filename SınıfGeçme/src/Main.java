import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fiz,turk,kim,muz;
        Scanner s = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        mat=s.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fiz=s.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turk=s.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kim=s.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muz=s.nextInt();
        int[] dersler= {mat,fiz,turk,kim,muz};
        int topders=0;
        int toplam=0;
        for(int i=0;i<dersler.length;i++){
         if(dersler[i]>=0&&dersler[i]<=100){
             toplam+=dersler[i];
             topders++;
          }
        }
        if(toplam/topders>=55){
            System.out.println("Geçti");
        }else{
            System.out.println("Kaldı");
        }
    }
}
