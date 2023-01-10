import java.util.Scanner;

public class tekrar6 {
    public static void main(String[] args) {
        int r;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        r=inp.nextInt();

        System.out.println("Daire çevre : "+ (2*3*r));
        System.out.println("Dairenin alanı :  " + (3*r*r));

    }
}
