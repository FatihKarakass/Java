
public class Ders17_overloading {
	public static void scorhesapla(String name,int score){
		System.out.println(name +"Adlý oyuncunun skoru: "+ score);
		
	}
	public static void scorhesapla(String name){
		System.out.println(name +"Adlý oyuncunun skoru:0 ");
		
	}
	public static void scorhesapla(int score){
		System.out.println("isimsiz oyuncunun skoru: "+ score);
		
	}
	public static void main(String[] args){
		scorhesapla("ahmet ",1000);
		scorhesapla("ahmet ");
		scorhesapla(1000);
	}
}
