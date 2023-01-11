import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2,sellect;
        Scanner input= new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz : ");
        n1 =input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 =input.nextInt();

        System.out.println("1-toplama \n2-çıkarma \n3-Çarpma \n4-bölme \n ---Birini seçiniz---");

        sellect=input.nextInt();

        switch (sellect){
            case 1:
                System.out.println("Sonuç : " +(n1+n2));
                break;
            case 2:
                System.out.println("Sonuç : " +(n1-n2));
                break;
            case 3:
                System.out.println("Sonuç : " +(n1*n2));
                break;
            case 4 :
                System.out.println("Sonuç : " +(n1/n2));
                break;
        }


    }
}
