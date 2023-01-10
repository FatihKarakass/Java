import java.util.Scanner;

public class tekrar4 {
    public static void main(String[] args) {
        System.out.println("-------Hipotenus bulma programına hg------");
        double kenar1,kenar2,hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.println("Kenar uzunluğunu giriniz : ");
        kenar1= input.nextDouble();
        System.out.println("Kenar uzunlugu giriniz : ");
        kenar2= input.nextDouble();


        hipotenus= Math.sqrt(kenar1*kenar1+kenar2*kenar2);

        System.out.println("Hiponeüsünüz : "+ (hipotenus));




    }
}
