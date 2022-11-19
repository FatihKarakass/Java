import java.util.Scanner;


public class Ders9 {
	public static void main(String[] args){
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("sayi yaz");
		int sayi = scan.nextInt();
		
		if (sayi == 1){
			System.out.println("Bir");
		}
		else if (sayi == 2){
			System.out.println("Ýki");

		}
		else if(sayi == 3){
			System.out.println("Üç");

		}
		
		else if(sayi == 4) {
			System.out.println("Dört");

		}
		*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý yaz");
		int sayi = scan.nextInt();
		
		switch(sayi){
			case 1:
				System.out.println("Bir");
			break;
			case 2:
				System.out.println("Ýki");
			break;
			case 3:
				System.out.println("Üç");
			break;
			case 4:
				System.out.println("Dört");
			break;
			default:
				System.out.println("Geçersiz sayý");
			break;
			
		}
		*/
		Scanner scan= new Scanner(System.in);
		
		int bakiye =1000;
		int islem;
		System.out.println("Ýþlemlerden birini seçiniz");
		System.out.println("1:Bakiye görüntüle");
		System.out.println("2:Para yatýrma");
		System.out.println("3:Para çekme");
		System.out.println("4:Sistemden çýk");

		islem = scan.nextInt();

		switch(islem){
		case 1:
			System.out.println("Bkiyeniz: "+bakiye+"tl dir.");
		break;
		
		case 2:
			System.out.println("Ne kadar yatýracaksýnýz");
			int miktar = scan.nextInt();
		
			bakiye +=miktar;
			System.out.println("Bkiyeniz "+bakiye+" TL dir");
		break;
		
		case 3:
			System.out.println("Ne kadar çekeceksiniz");
			miktar =scan.nextInt();
		
			if(miktar>1000){
				System.out.println("Bakiye yetersiz");
			}
			else{
				System.out.println("Bkiyeniz "+bakiye+" TL dir");

			}
			
			
	    break;
		case 4:
			System.out.println("Sistemden çýkýlýyor...");
		break;
		default:
			System.out.println("Hatalý giriþ");
		
		
		
		}
		
		
		
		
		
		
		
		
	}
}
