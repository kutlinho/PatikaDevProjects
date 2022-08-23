import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String username,password;
    Scanner s = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        username=s.next();
        System.out.println("Şifrenizi giriniz: ");
        password=s.next();

        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş başarılı!");
        }else{
            System.out.println("UYARI:Hatalı şifre! Şifrenizi değiştirmek istiyorsanız 1', tuşlayın. Çıkmak için 0'ı tuşlayın: ");
            int secim = s.nextInt();
            if(secim==1){
                for(;true;){
                    System.out.println("Yeni şifrenizi giriniz: ");
                    String yeniSifre=s.next();
                    if(yeniSifre.equals("java123")){
                        System.out.println("UYARI! Şifreniz eski şifrenizle aynı olmamalıdır.");
                    }else{
                        System.out.println("Yeni şifeniz başarıyla oluşturuldu!");

                        break;
                    }
                }
            }
        }
    }
}
