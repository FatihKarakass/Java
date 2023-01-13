import java.util.Scanner;

public class buecbulma14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int month,day;
        String burc="";

        System.out.println("Doğduğunuz ay :");
        month=input.nextInt();

        System.out.println("Douğduğunuz gün : ");
        day= input.nextInt();

        switch (month){
            case 1:
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="oğlak";
                    }else {
                        burc="kova";
                    }
                }else {
                    System.out.println("Gecersiz gün..");
                }

        }
        System.out.println("Burcunuz : "+burc);

        }

    }

