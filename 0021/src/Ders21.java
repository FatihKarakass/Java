import java.util.Scanner;


public class Ders21 {
	public static void mean(int[] arr){
		int total=0;
		for(int i =0;i<arr.length;i++){
			total += arr[i];
			
		}
		System.out.println("ortalama : "+ total/ arr.length);
		
	}
	public static void main(String[] args){
		
		Scanner scanner =new Scanner(System.in);
		
		
		int[] arr=new int[5];
		
		
		/*for(int i =0; i < arr1.length ;i++){
			System.out.println("De�er: "+ arr1[i]);
			
		}*/
		System.out.println("Arry in de�erlerini giriniz...");
		
		for(int i=0; i< arr.length ; i++){
			
			System.out.println(i+". de�erini giriniz: ");
			arr[i]=scanner.nextInt();

		}
		System.out.println("Arrey  de�erleriniz:  ");
		for(int i =0;i<arr.length ;i++){
			System.out.println(i+". de�eriniz: "+ arr[i]);
		}
		
		mean(arr);
		
		
		
		
		
		
		
		
		/*int[] arr2= new int[5];
		
		arr2[0]=1;
		arr2[1]=2;
		System.out.println("Arrey 2 nin birinci eleman�: "+ arr2[0]);
		System.out.println(".........:  "+ arr1[2]);*/
		
	}

}
