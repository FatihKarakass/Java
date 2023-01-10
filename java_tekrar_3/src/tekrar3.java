import java.util.Scanner;

public class tekrar3 {
    public static void main(String[] args) {
        double tutar,kdv;
        kdv = 18 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();



        System.out.println("KDV siz fiyat: " + (tutar));
        System.out.println("KDV tutarı: "+(tutar*kdv/100));
        System.out.println("KDV li tutar : "+((tutar*kdv/100)+tutar));


    }
}
