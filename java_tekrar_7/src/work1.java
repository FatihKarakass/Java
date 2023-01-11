import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        System.out.println("---Vücut Kitle İndeksi Hesaplama---");
        double vki;

        Scanner input = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz : ");
        double kg= input.nextDouble();

        System.out.println("Bouyunuzu giriniz : ");
        double boy= input.nextDouble();

        vki=kg/boy*boy;

        System.out.println("Vücut Kitle İndeksiniz : " + (vki));

    }
}
