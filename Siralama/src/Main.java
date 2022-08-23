import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Üç tane sayı girin: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int sayilar[]={a,b,c};
        for(int i=0;i<sayilar.length;i++){
            int minIndex=i;
            for (int j=i;j<sayilar.length;j++){
                if(sayilar[j]<sayilar[i]){
                    minIndex=j;
                }
            }
            int temp=sayilar[i];
            sayilar[i]=sayilar[minIndex];
            sayilar[minIndex]=temp;
        }
        for (int sayi:sayilar){
            System.out.print(sayi+" ");
        }
    }
}
