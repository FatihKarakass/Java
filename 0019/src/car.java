
public class car {

		private String color;
		private String model;
		private double engine;
		private int doors;
		
		public car(String color,String model){
			this(color,model,0,0);
		}
		
		public car(){
			
			/*this.color= "bilgiyok";
			this.model="bilgi yok";
			this.engine=0;
			this.doors=0;*/
			
			this("Bilgi yok","Bilgi yok",0,0);
			
			
		}
		
		public car(String color,String model,double engine,int doors){
			
			this.color=color;
			this.model=model;
			this.engine=engine;
			this.doors=doors;
			
		}
		

		public void showInfos(){
			System.out.println("araban�n rengi: "+ this.color);
			System.out.println("araban�n modeli: "+ this.model);
			System.out.println("araban�n motoru: "+ this.engine);
			System.out.println("araban�n kap� say�s�: "+ this.doors);
			System.out.println(""
					+ "");
		}
		
		
		
}
