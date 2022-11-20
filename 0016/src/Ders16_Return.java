 
public class Ders16_Return {
	public static int ucilecarp(int a){
		return a*3;
		
	}
	public static int ikitopla(int b){
		return(b+2);
		
	}
	public static int dortcýkart(int c){
		return(c-4);
	}
	
	public static void main(String[] args){
		
		System.out.println("Sonuc: " + ikitopla(dortcýkart(ikitopla(ucilecarp(5)))));
	}
}
