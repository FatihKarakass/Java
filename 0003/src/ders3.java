import java.util.Locale;
import java.util.Scanner;


public class ders3 {
	public static void main(String[] args){
		
	Scanner scan =new Scanner(System.in);
	
	scan.useLocale(Locale.CANADA);
	
	System.out.println("Tam sayi gitiniz:");
	
	double a =scan.nextDouble();
	
	System.out.println("Girdiðiniz sayi :"+a);
	
	
	}
}
