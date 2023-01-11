import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("---Manav Kasa Programı---");


        Scanner input =new Scanner(System.in);

        System.out.println("Kaç kilo armut istiyorsunuz:");
        double armut =input.nextDouble();
        double a =armut*2.14;

        System.out.println("Kaç kilo elma istiyorsunuz:");
        double elma =input.nextDouble();
        double e =elma*3.67;

        System.out.println("Kaç kilo domates istiyorsunuz:");
        double domates =input.nextDouble();
        double d =domates*1.11;

        System.out.println("Kaç kilo muz istiyorsunuz:");
        double muz =input.nextDouble();
        double m =muz*0.95;

        System.out.println("Kaç kilo patlıcan istiyorsunuz:");
        double patlican =input.nextDouble();
        double p =patlican*5.0;

        System.out.println("Toplam tutar : " + (a+e+d+m+p) + "TL");


    }
}
