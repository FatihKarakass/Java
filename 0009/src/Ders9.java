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
			System.out.println("�ki");

		}
		else if(sayi == 3){
			System.out.println("��");

		}
		
		else if(sayi == 4) {
			System.out.println("D�rt");

		}
		*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� yaz");
		int sayi = scan.nextInt();
		
		switch(sayi){
			case 1:
				System.out.println("Bir");
			break;
			case 2:
				System.out.println("�ki");
			break;
			case 3:
				System.out.println("��");
			break;
			case 4:
				System.out.println("D�rt");
			break;
			default:
				System.out.println("Ge�ersiz say�");
			break;
			
		}
		*/
		Scanner scan= new Scanner(System.in);
		
		int bakiye =1000;
		int islem;
		System.out.println("��lemlerden birini se�iniz");
		System.out.println("1:Bakiye g�r�nt�le");
		System.out.println("2:Para yat�rma");
		System.out.println("3:Para �ekme");
		System.out.println("4:Sistemden ��k");

		islem = scan.nextInt();

		switch(islem){
		case 1:
			System.out.println("Bkiyeniz: "+bakiye+"tl dir.");
		break;
		
		case 2:
			System.out.println("Ne kadar yat�racaks�n�z");
			int miktar = scan.nextInt();
		
			bakiye +=miktar;
			System.out.println("Bkiyeniz "+bakiye+" TL dir");
		break;
		
		case 3:
			System.out.println("Ne kadar �ekeceksiniz");
			miktar =scan.nextInt();
		
			if(miktar>1000){
				System.out.println("Bakiye yetersiz");
			}
			else{
				System.out.println("Bkiyeniz "+bakiye+" TL dir");

			}
			
			
	    break;
		case 4:
			System.out.println("Sistemden ��k�l�yor...");
		break;
		default:
			System.out.println("Hatal� giri�");
		
		
		
		}
		
		
		
		
		
		
		
		
	}
}
