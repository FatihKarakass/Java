import java.util.Scanner;


public class Ders7 {
	
	public static void main(String[] args){
		//System.out.println("1-Sonu� :" + ((3>4) && ("yaz�l�m"=="yaz�l�m")));
		
		String kullan�c�_ad� ="�ffk";
		String parola ="1234";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n� giriniz:");
		
		String kullan�c�_ad�2=scan.nextLine();
		
		System.out.println("Paraola:");
		String parola2=scan.nextLine();
		
		if( !(kullan�c�_ad�.equals(kullan�c�_ad�2))&& !(parola.equals(parola2)){
			System.out.println("Kullan�c� ad� ve parola yanl��!");
			
		}
		else if((kullan�c�_ad�.equals(kullan�c�_ad�2))&& !(parola.equals(parola2)){
			System.out.println("Parola yanl��!");
		}
		else if(!(kullan�c�_ad�.equals(kullan�c�_ad�2))&& (parola.equals(parola2)){
			System.out.println("Kullan�c� ad� yanl��!");
		}
		else ((kullan�c�_ad�.equals(kullan�c�_ad�2))&& (parola.equals(parola2)){
			System.out.println("Giri� ba�ar�l�...");

		}
	}

}
