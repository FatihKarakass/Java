import java.util.Scanner;

public class kullanıcıgirişi {
    public static void main(String[] args) {
        String userName,password,p,pt;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı adınız : ");
        userName =inp.nextLine();

        System.out.println("Şifreniz : ");
        password=inp.nextLine();

        if (userName.equals("ÖFFK") && password.equals("12345")){
            System.out.println("Giriş başarılı.");
        }
        else {
            System.out.println("Hatalı giriş");
            System.out.println("Şifreyi sıfırlamak istermisin (evet/hatyır)");
            String answer=inp.nextLine();
            if (answer.equals("evet")){
                System.out.println("Yeni şifreyi giriniz: ");
                p=inp.nextLine();
                if (p.equals("12345")){
                    System.out.println("Şifre oluşturulamadı,yeni şifre eskisiyle aynı olmamalı!");
                    System.out.println("Yeni şifreyi giriniz: ");
                    pt=inp.nextLine();
                    System.out.println("Yeni şifre oluşturuldu...");
                    System.out.println("Yeni şifreniz: " +pt);

                }
                else {
                    System.out.println("Yeni şifre oluşturuldu...");
                    System.out.println("Yeni şifreniz: " +p);


                }

            }
        }



        }



    }

