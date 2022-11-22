
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
			System.out.println("arabanýn rengi: "+ this.color);
			System.out.println("arabanýn modeli: "+ this.model);
			System.out.println("arabanýn motoru: "+ this.engine);
			System.out.println("arabanýn kapý sayýsý: "+ this.doors);
			System.out.println(""
					+ "");
		}
		
		
		
}
