import java.util.Scanner;


public class Ders14 {
	public static void  faktoriyel(){
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		int deger= scan.nextInt();
		int sayi=1;
		while(deger > 0){
			sayi=sayi*deger;
			
			deger--;
		}
		System.out.println("sonu�: "+ sayi);
		
	}
	public static void main(String[] args) {
		faktoriyel();
	
	}
	

}
