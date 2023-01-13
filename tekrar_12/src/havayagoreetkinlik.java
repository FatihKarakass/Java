import java.util.Scanner;

public class havayagoreetkinlik {
    public static void main(String[] args) {
        int derece;
        Scanner input=new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        derece=input.nextInt();
        if (derece<=5){
            System.out.println("Kayak yapmak için hava çok güzel...");
        } else if (derece>=6 && derece<=10) {
            System.out.println("Sinemaya gitmek için hava çok güzel...");
        }
        else if (derece>=11 && derece<=15) {
            System.out.println("Piknik yapmak veya sinemaya gitmek için hava çok güzel...");
        }
        else if (derece>=16 && derece<=25) {
            System.out.println("Yüzmek için hava çok güzel...");
        }




    }
}
