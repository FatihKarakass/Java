import java.util.Scanner;


public class Ders6 {
	public static void main(String[] args){
		
		/*a==b eþit mi
		 * a !=b eþitdeðilmi 
		 * a> b a b den büyük mü
		 * a<b  küçük mü
		 * a<= eþit küçükmü
		 */
		
		//System.out.println("Sonuç " +  (4==4));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		
		int note =scan.nextInt();
		
		
		if (note > 90){
			System.out.println("Dersten geçtiniz... aa aldýnýz");
		}
		else if(note >85){
			System.out.println("Dersten geçtiniz ab aldýnýz");
			
		}
		else{
			System.out.println("Dersten Kaldýnýz...");
		}
	}

}
