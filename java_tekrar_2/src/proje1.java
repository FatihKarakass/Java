import java.util.Scanner;

public class proje1 {
    public static void main(String[] args){
    int mat,fizik,kimya,turkce,tarih,muzik;

    Scanner inp =new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.println("Türkce Notunuz:");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz:");
        muzik = inp.nextInt();


        int toplam= (mat+fizik+turkce+tarih+muzik);
        double sonuc= toplam / 6.0;
        System.out.println("Not ortalamanız="+ (sonuc));


    }


}
