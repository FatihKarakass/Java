import java.util.Scanner;

public class bilet {
    public static void main(String[] args) {
        int km,yas,yt;
        double yasindirimlifiyat,gdi;


        Scanner input=new Scanner(System.in);

        System.out.println("-----Uçak bileti Fiyatı Hesaplama-----");

        System.out.println("Lütfen mesafe giriniz(KM) : ");
        km =input.nextInt();

        System.out.println("Yşınızı giriniz : ");
        yas=input.nextInt();

        System.out.println("Yüntipi Seçiniz \n1-Tek Yön \n2-Gidiş Dönüş");
        yt=input.nextInt();



        double normaltutar = (0.1 * km);
        System.out.println("Bilet Fiyatınız: "+ normaltutar);



        if (yas<12){
            System.out.println("Yaş intiriminiz : " + (normaltutar/2) );
            yasindirimlifiyat = normaltutar/2;
        } else if (yas >= 13 && yas <= 24) {
            System.out.println("Yaş indiriminiz : "+ (normaltutar%10) );
            yasindirimlifiyat = normaltutar%10;
        } else if (yas>=65) {
            System.out.println("Yaş indiriminiz : "+ (normaltutar%20));
            yasindirimlifiyat = normaltutar%20;
        }

        if (yt<=1){
            System.out.println("İndiriminiz bulunmamakta.");


        }else {
            System.out.println("Gidiş dönüş bilet indiriminiz: "+ (normaltutar%20));
        gdi=normaltutar%20;
        }
        /*switch (yt){
            case 1:
                System.out.println("Tek yön indiriminiz : Malesef bulunmamakta" );
        break;
            case 2:
                System.out.println("Gidiş dönüş indiriminiz : "+(normaltutar%20));
                gdi=normaltutar%20;
                break;
        }*/

        System.out.println("Ödemeniz gereken tutar : " + (normaltutar-yasindirimlifiyat));





    }
}
