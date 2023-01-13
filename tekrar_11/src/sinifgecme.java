import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input =new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat=input.nextInt();
        if (mat>100){
            mat=0;
        }
        if (mat<0){
            mat=0;
        }
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();
        if (fizik>100){
            fizik=0;
        }
        if (fizik<0){
            fizik=0;
        }
        System.out.println("turkce Notunuzu Giriniz: ");
        turkce=input.nextInt();
        if (turkce>100){
            turkce=0;
        }
        if (turkce<0){
            turkce=0;
        }
        System.out.println("kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();
        if (kimya>100){
            kimya=0;
        }
        if (kimya<0){
            kimya=0;
        }
        System.out.println("muzik Notunuzu Giriniz: ");
        muzik=input.nextInt();
        if (muzik>100){
            muzik=0;
        }
        if (muzik<0){
            muzik=0;
        }

        double avarage= ((mat+fizik+turkce+kimya+muzik)/5);
        if (avarage<=55){
            System.out.println("Sınıfta Kaldınız ......");

        }
        else {
            System.out.println("Tebrikler geçtiniz ......");


        }
        System.out.println("Ortalamanız : "+ avarage);






    }
}
