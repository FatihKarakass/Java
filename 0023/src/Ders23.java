import java.util.ArrayList;


public class Ders23 {
	
	public static void main(String[] args){
		
		ArrayList<String> grups = new ArrayList<String>();
		grups.add("asdg");
		grups.add("ahaedfh");
		
		grups.remove("asdg");//silmeye yar�yor
		grups.remove(0);//silmeya yar�yor
		
		
		/*System.out.println("0. eleman: "+ grups.get(0));
		System.out.println("1. eleman:  "+grups.get(1));
		System.out.println("de�er say�s�: "+grups.size());*/
		
		
		for(int i =0;i<grups.size();i++){
			System.out.println("Elemanlar: "+grups.get(i));
		}
	}
}
