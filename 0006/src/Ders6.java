import java.util.Scanner;


public class Ders6 {
	public static void main(String[] args){
		
		/*a==b e�it mi
		 * a !=b e�itde�ilmi 
		 * a> b a b den b�y�k m�
		 * a<b  k���k m�
		 * a<= e�it k���km�
		 */
		
		//System.out.println("Sonu� " +  (4==4));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		
		int note =scan.nextInt();
		
		
		if (note > 90){
			System.out.println("Dersten ge�tiniz... aa ald�n�z");
		}
		else if(note >85){
			System.out.println("Dersten ge�tiniz ab ald�n�z");
			
		}
		else{
			System.out.println("Dersten Kald�n�z...");
		}
	}

}
