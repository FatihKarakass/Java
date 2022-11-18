import java.util.Scanner;


public class Ders7 {
	
	public static void main(String[] args){
		//System.out.println("1-Sonuç :" + ((3>4) && ("yazýlým"=="yazýlým")));
		
		String kullanýcý_adý ="öffk";
		String parola ="1234";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kullanýcý adýný giriniz:");
		
		String kullanýcý_adý2=scan.nextLine();
		
		System.out.println("Paraola:");
		String parola2=scan.nextLine();
		
		if( !(kullanýcý_adý.equals(kullanýcý_adý2))&& !(parola.equals(parola2)){
			System.out.println("Kullanýcý adý ve parola yanlýþ!");
			
		}
		else if((kullanýcý_adý.equals(kullanýcý_adý2))&& !(parola.equals(parola2)){
			System.out.println("Parola yanlýþ!");
		}
		else if(!(kullanýcý_adý.equals(kullanýcý_adý2))&& (parola.equals(parola2)){
			System.out.println("Kullanýcý adý yanlýþ!");
		}
		else ((kullanýcý_adý.equals(kullanýcý_adý2))&& (parola.equals(parola2)){
			System.out.println("Giriþ baþarýlý...");

		}
	}

}
